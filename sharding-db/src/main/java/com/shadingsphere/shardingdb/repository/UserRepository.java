package com.shadingsphere.shardingdb.repository;


import com.shadingsphere.shardingdb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
