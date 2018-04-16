package com.zhaolin81.spring.framework.config.annotation.run;

import com.zhaolin81.spring.framework.config.annotation.appconfig.AppConfig;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaolin on 4/16/2018.
 */
public class XMLContextComponentScanAppConfigMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("componentscan_config_bean.xml");
        context.refresh();
        AppConfig appConfig = context.getBean(AppConfig.class);
        System.out.println(appConfig.env.getProperty("file.encoding"));
    }
}
