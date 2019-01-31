package sports.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello StringMVC");
        return "success";
    }

}
