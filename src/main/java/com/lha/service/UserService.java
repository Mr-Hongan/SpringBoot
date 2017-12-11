package com.lha.service;

import com.lha.dao.UserDao;
import com.lha.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.dc.pr.PRError;

import java.util.List;

/**
 * @Desrciption 用户业务层
 * @Author Lu.Hongan
 * @Date Created on 2017-12-09 23:23
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> queryUserList(){
        return this.userDao.queryUserList();
    }

}
