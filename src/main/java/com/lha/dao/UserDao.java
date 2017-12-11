package com.lha.dao;

import com.lha.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desrciption
 * @Author Lu.Hongan
 * @Date Created on 2017-12-09 23:15
 */
public class UserDao {

    public List<User> queryUserList(){
        List<User> result=new ArrayList<User>();

        //模拟数据库查询
        for(int i=0;i<10;i++){
            User user=new User();
            user.setUserName("username"+i);
            user.setPassword("password"+i);
            user.setAge(i+1);
            result.add(user);
        }
        return result;
    }
}
