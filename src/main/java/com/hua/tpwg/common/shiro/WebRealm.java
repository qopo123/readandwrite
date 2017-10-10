package com.hua.tpwg.common.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.springframework.stereotype.Component;

/**
 * Created by yangchuanhua on 2017/10/10.
 *
 */
@Component("realm")
public class WebRealm extends AuthenticatingRealm {
  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
    return null;
  }
}
