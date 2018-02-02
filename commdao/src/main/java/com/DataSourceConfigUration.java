package com;

import com.config.DBConfigProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by chaopeng.lv on 2018/2/1.
 * 数据源配置
 */

@Configuration
@MapperScan(basePackages="com.lili.mapper")
public class DataSourceConfigUration {


    /**
     * 数据源设置
     * @param dbConfigProperties
     * @return
     */
    @Bean
    public DataSourceProperties dataSource(DBConfigProperties dbConfigProperties) {
        DataSourceProperties dataSourceProperties = new DataSourceProperties();
        dataSourceProperties.setUrl(dbConfigProperties.getUrl());
        dataSourceProperties.setDriverClassName(dataSourceProperties.getDriverClassName());
        dataSourceProperties.setUsername(dataSourceProperties.getDataUsername());
        dataSourceProperties.setPassword(dataSourceProperties.getPassword());
        return dataSourceProperties;
    }

}
