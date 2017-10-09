package com.hua.tpwg.common;

import com.hua.tpwg.context.DataSourceContextHoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by yangchuanhua on 2017/9/28.
 */
public class DymicDataSource extends AbstractRoutingDataSource {

  private static final Logger logger = LoggerFactory.getLogger(DymicDataSource.class);

  @Override
  protected Object determineCurrentLookupKey() {
    logger.debug("=========②确定数据源=======");
    return DataSourceContextHoder.getDataSourceType();
  }
}
