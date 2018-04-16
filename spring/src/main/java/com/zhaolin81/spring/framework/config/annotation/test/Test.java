package com.zhaolin81.spring.framework.config.annotation.test;

import com.zhaolin81.spring.framework.config.annotation.appconfig.AppConfig;
import com.zhaolin81.spring.framework.config.annotation.bean.IBean;
import com.zhaolin81.spring.framework.config.annotation.otherconfig.DatabaseConfig;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * Created by zhaolin on 4/16/2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class, DatabaseConfig.class})
public class Test {
    @Autowired
    IBean bean;
    @Autowired
    DataSource dataSource;

    @org.junit.Test
    public void test(){
        Assert.assertNotNull(bean);
        Assert.assertNotNull(dataSource);
    }
}
