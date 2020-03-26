package com.shadingsphere.shardingdb.controller;

import com.google.common.collect.Lists;
import com.shadingsphere.shardingdb.entity.User;
import com.shadingsphere.shardingdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author hangaoming
 * @Time 2020/3/24 14:16
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/saveUserInfo")
    public Object SaveUserInfo(){
        List<User> userList = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setId(i);
            user.setUserName("测试人" + i);
            user.setAge(i == 0 ? 1 : i);
            userList.add(user);
        }
        userService.SaveUserInfo(userList);
        return "成功";
    }

    @RequestMapping("/findAllUserInfo")
    public Object FindAllUserInfo(){
        return userService.FindAllUserInfo();
    }
}
