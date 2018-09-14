package com.zcb.springbootmybatisdemo.service;

import com.zcb.springbootmybatisdemo.model.User;

import java.util.List;

/****
 *  操作用户业务逻辑层接口
 *  author:zcb
 *  2018-09-13 14:50
 */
public interface IUserService {
    /***
     * 获取所有用户信息
     * @return
     */
    public List<User> listUsers();

    /***
     *  根据ID获取用户信息
     * @param id
     * @return
     */
    public User getUserById(long id);
}
