
/**
 * @ClassName DynamicDataSource
 * @Description
 * @Autohor huanggenchao
 * @DATE 2018/7/23 19:01
 **/
package com.jk.aop;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource{

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceSwitcher.getDataSource();
    }

}
