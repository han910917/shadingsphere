package com.shadingsphere.shardingdbtablereadwrite.repository;


import com.shadingsphere.shardingdbtablereadwrite.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = " select * from user where id > ?1 order by id limit ?2 ", nativeQuery = true)
    List<User> findUserById(Integer startRows, Integer rows);
}
