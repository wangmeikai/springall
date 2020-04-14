package com.wmk;

import com.wmk.config.conf;
import com.wmk.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac =
                new AnnotationConfigApplicationContext(conf.class);
        UserServiceImpl userService = (UserServiceImpl) acac.getBean("s");
        userService.say();
        System.out.println("====================");
        userService.cry();
    }
}
