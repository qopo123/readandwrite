package com.hua.tpwg.controller;

import com.hua.tpwg.entity.User;
import com.hua.tpwg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yangchuanhua on 2017/9/28.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/all", method = RequestMethod.GET)
  public List<User> selectAllUsers(){
    return userService.selectAllUsers();
  }
}
