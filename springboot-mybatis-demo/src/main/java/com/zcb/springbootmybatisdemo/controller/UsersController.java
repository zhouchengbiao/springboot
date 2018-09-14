package com.zcb.springbootmybatisdemo.controller;

import com.zcb.springbootmybatisdemo.model.User;
import com.zcb.springbootmybatisdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 *  用户列表类
 *  author:zcb
 *  2018-09-13 14:48
 */
@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    IUserService userService;

    /***
     * 获取所有用户
     * @return
     */
    @RequestMapping("/userList")
    public List<User> listUsers(){
        List<User> users = userService.listUsers();
        return users;
    }

    @RequestMapping(value="/getUserById",method = RequestMethod.GET)
    public User getUserById(@RequestParam(required=false,defaultValue="0") long id){
            User user = null;
        try{
            user = userService.getUserById(id);
            return user;
        }catch (Exception e){
            user = new User();
            return user;
        }
    }
}
