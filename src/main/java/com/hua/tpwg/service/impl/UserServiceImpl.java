package com.hua.tpwg.service.impl;

import com.hua.tpwg.annotations.DataSource;
import com.hua.tpwg.dao.UserMapper;
import com.hua.tpwg.entity.User;
import com.hua.tpwg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangchuanhua on 2017/9/28.
 */
@Service
public class UserServiceImpl implements UserService {

  public User selectUserByUserName(String userName) {
    return null;
  }

  @Autowired
  private UserMapper userMapper;


  @Override
  @DataSource("write")
  public List<User> selectAllUsers() {
    return userMapper.selectAllUsers();
  }

  @Override
  @DataSource("read")
  public List<User> selectReadAllUsers() {
    return userMapper.selectAllUsers();
  }
}
