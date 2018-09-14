package com.zcb.springbootmybatisdemo.dao;

import com.zcb.springbootmybatisdemo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {

    public List<User> listUsers();

    User getUserById(long id);
}
