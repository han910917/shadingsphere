package com.shadingsphere.shardingdb.service.impl;

import com.shadingsphere.shardingdb.entity.User;
import com.shadingsphere.shardingdb.repository.UserRepository;
import com.shadingsphere.shardingdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author hgm
 * @Time 2020/3/24 15:22
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void SaveUserInfo(List<User> userList) {
        userRepository.saveAll(userList);
    }

    @Override
    public List<User> FindAllUserInfo() {
        return userRepository.findAll();
    }

    @Override
    public Object findByIdTen(Integer page, Integer rows) {
        Integer startRows = ( page >= 0 ? 1 : page - 1) * rows;
        return userRepository.findUserById(startRows, rows);
    }
}
