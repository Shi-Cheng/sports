package sports.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sports.entity.NoteResult;
import sports.entity.User;
import sports.service.UserService;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;

@Controller
public class LoginController {
    @Resource
    private UserService userService;
    /*
     * 用户登陆模块
     * */
    @RequestMapping(path = "/checkLogin")
    @ResponseBody
    public NoteResult checkLogin(@RequestBody User user) throws NoSuchAlgorithmException {
        String username = user.getUsername();
        String password = user.getPassword();
        NoteResult result = userService.login(username,password);
        return result;
    }
}
