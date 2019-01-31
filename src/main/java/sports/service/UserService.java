package sports.service;
import sports.entity.NoteResult;
import sports.entity.User;
import sports.entity.UserNameKey;

import java.security.NoSuchAlgorithmException;

public interface UserService {

    //通过用户名及密码核查用户登陆
    public NoteResult login(String username , String password) throws NoSuchAlgorithmException;
    //添加用户
    public NoteResult  register(String username , String password) throws NoSuchAlgorithmException;
    //根据用户名查询
    public UserNameKey fingByUserName(String user);

}
