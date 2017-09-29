package com.hua.tpwg.context;

/**
 * Created by yangchuanhua on 2017/9/28.
 */
public class DataSourceContextHoder {

  private static final ThreadLocal<String> dataSourceNames = new ThreadLocal<String>();

  /**
   * 获取
   * @return
   */
  public static String getDataSourceType(){
    return dataSourceNames.get();
  }

  public static void putData(String value){
    dataSourceNames.set(value);
  }

}
