package com.hua.tpwg.entity;

import java.io.Serializable;

/**
 * Created by yangchuanhua on 2017/9/28.
 */
public class User implements Serializable {

  private static final long serialVersionUID = -1L;

  /*用户名*/
  private String userName;

  /*密码*/
  private String passWord;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }
}
