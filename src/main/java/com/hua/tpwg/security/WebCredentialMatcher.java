package com.hua.tpwg.security;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;

public class WebCredentialMatcher implements CredentialsMatcher {

  @Override
  public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
    UsernamePasswordToken upToken = (UsernamePasswordToken) token;
    String passwordOnToken = new String(upToken.getPassword());
    SimpleAuthenticationInfo saInfo = (SimpleAuthenticationInfo) info;
    return false;
  }

}
