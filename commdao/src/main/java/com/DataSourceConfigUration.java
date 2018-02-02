package com;

import com.alibaba.druid.pool.DruidDataSource;
import com.config.DBConfigProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * Created by chaopeng.lv on 2018/2/1.
 * 数据源配置
 */

@Configuration
@MapperScan(basePackages="com.mapper")
public class DataSourceConfigUration {


    /**
     * 数据源设置
     * @param dbConfigProperties
     * @return
     */
    @Bean
    public DataSource druidDataSource(DBConfigProperties dbConfigProperties) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(dbConfigProperties.getUrl());
        druidDataSource.setDriverClassName(dbConfigProperties.getDriverClass());
        druidDataSource.setUsername(dbConfigProperties.getUsernamel());
        dbConfigProperties.setPassword(dbConfigProperties.getPassword());
        return druidDataSource;
    }




}
