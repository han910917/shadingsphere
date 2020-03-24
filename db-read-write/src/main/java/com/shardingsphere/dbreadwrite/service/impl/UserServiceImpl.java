package com.shardingsphere.dbreadwrite.service.impl;

import com.shardingsphere.dbreadwrite.entity.User;
import com.shardingsphere.dbreadwrite.repository.UserRepository;
import com.shardingsphere.dbreadwrite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author hangaoming
 * @Time 2020/3/24 15:22
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveAll(List<User> userList) {
        userRepository.saveAll(userList);
    }

    @Override
    public List<User> findAll() {
        List<User> userList = userRepository.findAll();
        return userList;
    }
}
