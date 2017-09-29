package com.hua.tpwg.common;

import com.hua.tpwg.context.DataSourceContextHoder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by yangchuanhua on 2017/9/28.
 */
public class DymicDataSource extends AbstractRoutingDataSource {

  @Override
  protected Object determineCurrentLookupKey() {
    return DataSourceContextHoder.getDataSourceType();
  }
}
