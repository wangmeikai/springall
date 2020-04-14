package com.wmk.service.impl;

import com.wmk.service.UserService;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component("s")
public class UserServiceImpl implements UserService {
    //构造器（new）
    public UserServiceImpl() {
//        System.out.println("enty....init");
    }
    //后置构造器（new 完之后执行）
    @PostConstruct
    public void haha(){
//        System.out.println("enty....PostConstruct");
    }


    public void say() {
        System.out.println("say()");
//        int i = 1/0;
    }

    public void cry() {
        System.out.println("cry()");
    }

}

