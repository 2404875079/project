package com.qf.controller;

import com.qf.domain.Msg;
import com.qf.domain.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("/findById")
    @ResponseBody
    public User findById(){
        User user = userService.findById(1);
        return user;
    }
    @RequestMapping("/updateUser")
    @ResponseBody
    public Msg updateUser(User user){
        Msg msg = new Msg();
        user.setU_id(1);
        if (user.getU_email()!=""&&user.getU_name()!=""){
            userService.updateUser(user);
            msg.setCode(1);
            return msg;
        }else{
            msg.setCode(0);
            return msg;
        }
    }
    @RequestMapping("/updatePd")
    @ResponseBody
    public Msg updatePd(User user){
        Msg msg = new Msg();
        User user1 = userService.findById(1);
        if (user1.getU_password().equals(user.getU_password1())&&!user.getU_password().equals("")){
            user.setU_id(1);
            userService.updatePw(user);
            msg.setCode(1);
            return msg;
        }
        else{
            msg.setCode(0);
            return msg;
        }
    }
}
