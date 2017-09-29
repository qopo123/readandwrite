package com.hua.tpwg.dao;

import com.hua.tpwg.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yangchuanhua on 2017/9/29.
 */
@Repository
public interface UserMapper {

  public List<User> selectAllUsers();
}
