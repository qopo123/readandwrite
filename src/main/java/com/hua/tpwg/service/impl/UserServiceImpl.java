package com.hua.tpwg.service.impl;

import com.hua.tpwg.annotations.DataSource;
import com.hua.tpwg.dao.UserMapper;
import com.hua.tpwg.entity.User;
import com.hua.tpwg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yangchuanhua on 2017/9/28.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

  @DataSource("read")
  public User selectUserByUserName(String userName) {
    return null;
  }

  @Autowired
  private UserMapper userMapper;

  @Override
  public List<User> selectAllUsers() {
    return userMapper.selectAllUsers();
  }


}
