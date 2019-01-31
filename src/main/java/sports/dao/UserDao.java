package sports.dao;
import net.sf.json.JSONObject;
import sports.entity.User;
import sports.entity.UserNameKey;


public interface UserDao {
    //用于新增用户名的判断和用户的增加
    public UserNameKey findByName(String name);

    //用户添加
    public void save(JSONObject jsonObject);

}
