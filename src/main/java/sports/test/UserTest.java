package sports.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sports.service.UserService;

public class UserTest {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        UserService  userService = (UserService) ac.getBean("userService");
        userService.fingByUserName("aaaa");
        //调方法
    }

}
