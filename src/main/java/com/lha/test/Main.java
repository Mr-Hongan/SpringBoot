package com.lha.test;

import com.lha.config.SpringConfig;
import com.lha.entity.User;
import com.lha.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @Desrciption
 * @Author Lu.Hongan
 * @Date Created on 2017-12-10 00:14
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new
                AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService=context.getBean(UserService.class);
        List<User> users=userService.queryUserList();
        for(User user:users){
            System.out.println(user.getUserName()+","+user.getPassword()+","+user.getAge());
        }
        System.out.println("已结束");
        context.destroy();
    }
}
