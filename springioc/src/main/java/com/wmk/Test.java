package com.wmk;

import com.wmk.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac
                = new ClassPathXmlApplicationContext("classpath:application.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.query();

    }
}
