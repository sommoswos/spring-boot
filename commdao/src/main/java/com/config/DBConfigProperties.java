package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by chaopeng.lv on 2018/2/1.
 * db配置文件
 */
@Component
@PropertySource("classpath:db.properties")
@ConfigurationProperties(prefix = "db")
public class DBConfigProperties {

    private String url;

    private String usernamel;

    private String password;

    private String driverClass;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsernamel() {
        return usernamel;
    }

    public void setUsernamel(String usernamel) {
        this.usernamel = usernamel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }
}
