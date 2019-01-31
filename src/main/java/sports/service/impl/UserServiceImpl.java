package sports.service.impl;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;
import sports.entity.NoteResult;
import sports.entity.User;
import sports.entity.UserNameKey;
import sports.service.UserService;
import sports.util.UserUtil;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public NoteResult  login(String username, String password) throws NoSuchAlgorithmException {
        //User user = userDao.findByName(username);   根据username为主键进行判断
       // UserNameKey userNameKey = userDao.findByName(username); //调用查询接口
        NoteResult noteResult = new NoteResult();
        UserNameKey userNameKey = new UserNameKey();
        if(userNameKey.getUsername() == null){
            noteResult.setStatus(1);
            noteResult.setMsg("用户名不存在");
            return noteResult;
        }
        String md5_pwd = UserUtil.md5(password);
        if (!userNameKey.getPassword().equals(md5_pwd)){
            noteResult.setStatus(2);
            noteResult.setMsg("密码不正确");
            return noteResult;
        }
        noteResult.setStatus(0);
        noteResult.setMsg("用户名和密码正确");
        return noteResult;
    }

    @Override
    public NoteResult register(String username, String password) throws NoSuchAlgorithmException {
        //根据字符串来判断用户注册状态  并涉及到上链，两条链，主键分别为   UUID 和 nameUUID
        // UserNameKey userNameKey = userDao.findByName(username); //模拟<UserNameKey.Value>链上查询
        NoteResult noteResult = new NoteResult();

        UserNameKey userNameKey = new UserNameKey(); //调用查询接口
        if(userNameKey.getUsername() != null ){
            noteResult.setStatus(1);
            noteResult.setMsg("用户名不存在");
            return noteResult;
        }
        //UUIDKey 记录形式
        User user = new User();
        user.setUsername(username);
        String md5_pwd = UserUtil.md5(password);
        user.setPassword(md5_pwd);
        String userUUID = UserUtil.creadid();

        Map<String,User> userMap = new HashMap<>();
        userMap.put(userUUID,user);
        JSONObject userJSON = JSONObject.fromObject(userMap);

        //UserNameKey记录形式
        UserNameKey unk = new UserNameKey();
        unk.setUsername(username);
        unk.setPassword(md5_pwd);
        unk.setUUID(userUUID);

        noteResult.setMsg("注册成功");
        noteResult.setData(userUUID);

        Map<String,UserNameKey> userNameKeyMap = new HashMap<>();
        userNameKeyMap.put(username,unk);
        JSONObject userNameKeyJSON = JSONObject.fromObject(userNameKeyMap);

        //调用UserDao进行保存
//        userDao.save(userJSON);//模拟<UUID,Value>上链
//        userDao.save(userNameKeyJSON); //模拟<UserNameKey.Value> 上链
        return noteResult;
    }

    @Override
    public UserNameKey fingByUserName(String user) {
        return null;
    }
}
