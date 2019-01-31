package sports.controller;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sports.entity.NoteResult;
import sports.entity.User;
import sports.service.UserService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.security.NoSuchAlgorithmException;

@Controller
@RequestMapping("user/")
public class UserController {

    @Autowired
    private UserService userService;
    /*
    *  用户注册模块
    *  包含用户注册信息判断，为用户生成身份唯一标识符
    * */
    @RequestMapping(value = "/loginInfo",consumes = "application/json")
    public @ResponseBody String loginInfo(@RequestBody User user) throws NoSuchAlgorithmException {
        System.out.println("===================表现层执行结果=====================");
        String name = user.getUsername();
        String password = user.getPassword();
        NoteResult noteResult =  userService.register(name,password);
        String noteResultJson = JSON.toJSONString(noteResult);
        System.out.println("========================"+noteResultJson+"======================");
        return noteResultJson;
    }
    @GetMapping("/hello")
    public void test(){
        System.out.println("helloworld");
    }

}
