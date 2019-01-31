package sports.controller;
//import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import sports.entity.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.sf.json.JSONObject;




@Controller
@RequestMapping("/user")
@SessionAttributes(value = {"msg"})
public class secondController {

    @RequestMapping("/testString")
    public String testString(){
        System.out.println("testString 方法执行了....");
        return "success";
    }

    @RequestMapping("/userString")
    public String userString(Model model){
        System.out.println("testString 方法执行了....");

        return "success";
    }

    /*
    * void
    * 请求转发一次，不用编写项目名称
    * */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("testVoid 方法执行了...");
        //编写请求转发程序
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //重定向
        //response.sendRedirect(request.getContextPath()+"/index.jsp");
        //设置中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;chartset=UTF-8");
        //直接回进行响应
        response.getWriter().print("你好");
        return;
    }

    @RequestMapping("/testSessionAttritubes")
    public String testSessionAttritubes(Model model){
        System.out.println("testSessionAttritubes 被执行了....");
        model.addAttribute("msg","=========info==========");
        return "success";
    }

    @RequestMapping("/getSessionAttritubes")
    public String getSessionAttritubes(ModelMap modelMap){
        System.out.println("getCookieValue 被执行了....");
        String cookieValue = (String) modelMap.get("msg");
        System.out.println(cookieValue);
        return "success";
    }
    @RequestMapping("/delSessionAttritubes")
    public String delSessionAttritubes(SessionStatus sessionStatus){
        System.out.println("delSessionAttritubes 被执行了....");
        sessionStatus.setComplete();

        return "success";
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("info") User user){
        System.out.println("testModelAttribute 被执行了...");
        System.out.println(user);
        return "success";
    }
    @ModelAttribute
    public void showUser(String uname, Map<String,User> map){
        User user = new User();
        user.setUsername(uname);
        user.setPassword("123");
        map.put("info",user);
        System.out.println(map);
    }

    /*
    * 模拟Ajax异步请求
    * */
//    @RequestMapping("/testAjax")
//    public void testAjax(@RequestBody String body){
//        System.out.println("testAjax方法被执行了....");
//        System.out.println(body);
//    }
//    @RequestMapping("/testAjax")
//    public User testAjax(@RequestBody User user){
//        System.out.println("testAjax方法执行了....");
//        System.out.println(user);
//        user.setUsername("nihao");
//        user.setUsername("1");
//        return user;
//    }

    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax方法执行了....");
        String name = user.getUsername();
        System.out.println(name);
//        String uuid = UUID.randomUUID().toString().replace("-","");
//        Map<String,User> map = new HashMap<>();
//        map.put(uuid,user);
//        JSONObject jsonObject = JSONObject.fromObject(map);
//        System.out.println(jsonObject);
        return user;
    }
    @RequestMapping("/testUUID")
    public String testUUID(){
        String uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid);
        return "success";
    }

}
