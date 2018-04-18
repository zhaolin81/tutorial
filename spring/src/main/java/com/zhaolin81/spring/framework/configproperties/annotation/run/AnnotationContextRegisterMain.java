package com.zhaolin81.spring.framework.configproperties.annotation.run;

import com.zhaolin81.spring.framework.configproperties.annotation.properties.AppConfigProperties;
import com.zhaolin81.spring.framework.configproperties.annotation.properties.EnableSwitch;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaolin on 4/16/2018.
 */
public class AnnotationContextRegisterMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(EnableSwitch.class);
        context.register(AppConfigProperties.class);
        context.refresh();
        AppConfigProperties appConfig = context.getBean(AppConfigProperties.class);
        System.out.println(appConfig.getData());
        System.out.println(appConfig.getNum());
    }
}
