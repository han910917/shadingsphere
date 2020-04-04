package com.shadingsphere.shardingtable.controller;

import com.google.common.collect.Lists;
import com.shadingsphere.shardingtable.entity.User;
import com.shadingsphere.shardingtable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author hgm
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

    /**
     * 查询所有信息
     * @author hgm
     * @Time 2020/3/30 12:36
     * @param 
     * @return java.lang.Object
     */
    @RequestMapping("/findAllUserInfo")
    public Object FindAllUserInfo(){
        return userService.FindAllUserInfo();
    }

    /**
     * 查询前十信息
     * @author hgm
     * @Time 2020/3/30 12:36
     * @param
     * @return java.lang.Object
     */
    @RequestMapping("/findByIdTen")
    public Object findByIdTen(Integer page, Integer rows){
        return userService.findByIdTen( page, rows );
    }
}
