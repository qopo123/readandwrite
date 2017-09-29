package com.hua.tpwg.service  ;

import com.hua.tpwg.entity.User;

import java.util.List;

/**
 * Created by yangchuanhua on 2017/9/28.
 */
public interface UserService {

  public User selectUserByUserName(String userName);

  public List<User> selectAllUsers();
}
