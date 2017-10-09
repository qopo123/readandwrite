package com.hua.tpwg.controller;

import com.hua.tpwg.entity.User;
import com.hua.tpwg.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

  private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/all", method = RequestMethod.GET)
  public List<User> selectAllUsers(){
    LOGGER.debug("===========查询所有的用户========");
    return userService.selectAllUsers();
  }

  @RequestMapping(value = "/read", method = RequestMethod.GET)
  public List<User> selectAllReadUsers(){
    LOGGER.debug("===========查询所有的用户========");
    return userService.selectReadAllUsers();
  }

  @RequestMapping(value = "/name", method = RequestMethod.GET)
  public String name(){
    LOGGER.debug("===========查询用户名========");
    String name = "haohao";
    return name;
  }
}
