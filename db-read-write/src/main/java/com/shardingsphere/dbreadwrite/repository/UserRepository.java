package com.shardingsphere.dbreadwrite.repository;

import com.shardingsphere.dbreadwrite.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
