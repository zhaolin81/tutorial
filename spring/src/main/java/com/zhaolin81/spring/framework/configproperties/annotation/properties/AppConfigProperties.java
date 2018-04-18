package com.zhaolin81.spring.framework.configproperties.annotation.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zhaolin on 4/18/2018.
 */
@ConfigurationProperties(prefix = "test",locations = "classpath:test.properties")
public class AppConfigProperties {
    private String data;
    private int num;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
