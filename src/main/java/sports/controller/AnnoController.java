package sports.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import sports.entity.User;
import java.util.Map;

/*
*
* */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"}) //把msg=aaa存放在session域对象中
public class AnnoController {

    @RequestMapping(path = "/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("this is testRequestParam" + username);
        return "success";
    }

    @RequestMapping(path = "/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了....");
        System.out.println(body);
        return "success";
    }

    @RequestMapping(path = "/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable("sid") String id){
        System.out.println("执行了...");
        System.out.println(id);
        return "success";
    }

    @RequestMapping(path = "/testCookieValue")
    public String testCookieValue(@CookieValue(name = "JSESSIONID") String cookieValue){
        System.out.println("执行了...");
        System.out.println(cookieValue);
        return "success";
    }
    /*
    * A2：该方法后执行，读取到showUser传入的值
    * */
//    @RequestMapping(path = "/testModelAttribute")
//    public String testModelAttribute(@ModelAttribute("abc") User user){
//        System.out.println("testModelAttribute 执行了");
//        System.out.println(user);
//        return "success";
//    }
    /*
    * A1：该方法先执行
    *
    @ModelAttribute
    public User showUser(String uname){
        System.out.println("showUser先执行了....");
        //通过用户查询数据库  (模拟数据)
        User user = new User();
        user.setUsername(uname);
        user.setdateTime(new Date());
        user.setPassword("123");
        user.setStatus("1");
        return user;
    }
    * */
    @RequestMapping(path = "/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("testModelAttribute 执行了");
        System.out.println(user);
        return "success";
    }
    @ModelAttribute
    public void showUser(String uname, Map<String,User> map){
        System.out.println("showUser先执行了....");
        //通过用户查询数据库  (模拟数据)
        User user = new User();
        user.setUsername(uname);
        user.setPassword("123");
        map.put("abc",user);
    }
    /*
    *session操作演练
    * testSessionAttritubes的注解
    * */
    @RequestMapping(path = "/testSessionAttritubes")
    public String testSessionAttritubes(Model model){
        System.out.println("testSessionAttritubes 执行了");
        model.addAttribute("msg","==============aaaaa=================");
        return "success";
    }

    @RequestMapping(path = "/delSessionAttritubes")
    public String getSessionAttritubes(SessionStatus status){
        System.out.println("getSessionAttritubes 执行了");
        status.setComplete();
        return "success";
    }
    @RequestMapping(path = "/getSessionAttritubes")
    public String delSessionAttritubes(ModelMap modelMap){
        System.out.println("delSessionAttritubes 执行了");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }


}
