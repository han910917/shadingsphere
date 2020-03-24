package com.shardingsphere.dbreadwrite.controller;

import com.google.common.collect.Lists;
import com.shardingsphere.dbreadwrite.entity.User;
import com.shardingsphere.dbreadwrite.service.UserService;
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
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public Object Test(){
        List<User> userList = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setId(i);
            user.setUserName("测试人" + i);
            user.setAge(i == 0 ? 1 : i);
            userList.add(user);
        }
        userService.saveAll(userList);
        return "成功";
    }

    @RequestMapping("/read")
    public Object Read(){
        return userService.findAll();
    }
}
