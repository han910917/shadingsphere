package com.shardingsphere.dbreadwrite.service;

import com.shardingsphere.dbreadwrite.entity.User;

import java.util.List;

/**
 * @Description
 * @Author hangaoming
 * @Time 2020/3/24 15:21
 **/
public interface UserService {

    void saveAll(List<User> userList);

    List<User> findAll();
}
