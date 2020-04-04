package com.shadingsphere.shardingtablereadwrite.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @Description
 * @Author hgm
 * @Time 2020/3/24 14:58
 **/
@Entity
@Data
@Setter
@Getter
@Table(name="user")
public class User {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String userName;

    @Column(name = "age")
    private Integer age;
}
