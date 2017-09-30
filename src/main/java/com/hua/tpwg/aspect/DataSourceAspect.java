package com.hua.tpwg.aspect;

import com.hua.tpwg.annotations.DataSource;
import com.hua.tpwg.context.DataSourceContextHoder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


/**
 * Created by yangchuanhua on 2017/9/28.
 */

@Aspect
@Component
public class DataSourceAspect {

  private static final Logger logger = LoggerFactory.getLogger(DataSourceAspect.class);

//  @Pointcut("execution(* com.hua.tpwg.service.*.*(..))")
  @Pointcut("@annotation(com.hua.tpwg.annotations.DataSource)")
  public void pointcut(){}

  @Before(value = "pointcut()")
  public void before(JoinPoint point){
    logger.debug("===========进入了切面=========");
    try {
      String methodName = point.getSignature().getName();
      Class clazz = point.getSignature().getDeclaringType();
      Method method = clazz.getMethod(methodName);
      DataSource annotation = method.getAnnotation(DataSource.class);
      String value = annotation.value();
      DataSourceContextHoder.putData(value);
    } catch (NoSuchMethodException e) {
      logger.error("获取注解信息出错", e);
    }
    logger.debug(point.getSignature().getName());
  }
}
