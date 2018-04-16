package com.zhaolin81.spring.framework.config.annotation.run;

import com.zhaolin81.spring.framework.config.annotation.appconfig.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * Created by zhaolin on 4/16/2018.
 */
public class AnnotationContextRegisterImportMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
