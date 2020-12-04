package com.zut.xxp.niuke.dao;


import com.zut.xxp.niuke.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface UserDao {

    public User getUser(int id);

//    public List<User> getUsers(String username);

    public List<User> getUsers(int offSet,int limit);


}
