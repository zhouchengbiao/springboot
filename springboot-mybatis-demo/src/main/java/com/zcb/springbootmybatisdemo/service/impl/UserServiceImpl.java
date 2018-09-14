package com.zcb.springbootmybatisdemo.service.impl;

import com.zcb.springbootmybatisdemo.dao.IUserDao;
import com.zcb.springbootmybatisdemo.model.User;
import com.zcb.springbootmybatisdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/****
 *  操作用户业务逻辑层
 *  author:zcb
 *  2018-09-13 14:50
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    /***
     * 获取所有用户信息
     * @return
     */
    @Override
    public List<User> listUsers() {
        return iUserDao.listUsers();
    }

    /***
     * 根据ID获取用户信息
     * @param id
     * @return
     */
    @Override
    public User getUserById(long id) {
        return iUserDao.getUserById(id);
    }
}
