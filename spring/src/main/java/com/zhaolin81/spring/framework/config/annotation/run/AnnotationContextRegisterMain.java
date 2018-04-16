package com.zhaolin81.spring.framework.config.annotation.run;

import com.zhaolin81.spring.framework.config.annotation.bean.IBean;
import com.zhaolin81.spring.framework.config.annotation.appconfig.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaolin on 4/16/2018.
 */
public class AnnotationContextRegisterMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        IBean appBean = (IBean)context.getBean("appBean");
        System.out.println(appBean);
    }
}
