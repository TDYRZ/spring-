package com.yrz.comm;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author yrz
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    /**
     * 取得当前使用哪个数据源
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DbContextHolder.getDbType();
    }
}
