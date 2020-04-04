package com.shadingsphere.shardingtablereadwrite.service;


import com.shadingsphere.shardingtablereadwrite.entity.User;

import java.util.List;

/**
 * @Description
 * @Author hgm
 * @Time 2020/3/24 15:21
 **/
public interface UserService {

    void SaveUserInfo(List<User> userList);

    List<User> FindAllUserInfo();

    Object findByIdTen(Integer page, Integer rows);
}
