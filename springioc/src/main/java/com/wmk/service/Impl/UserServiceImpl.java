package com.wmk.service.Impl;

import com.wmk.dao.UserDao;
import com.wmk.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public void query() {
        System.out.println("业务处理");
        userDao.selectAll();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
