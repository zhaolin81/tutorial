package com.zhaolin81.spring.framework.configproperties.annotation.run;

import com.zhaolin81.spring.framework.configproperties.annotation.appconfig.AppConfig;
import com.zhaolin81.spring.framework.configproperties.annotation.bean.IBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaolin on 4/16/2018.
 */
public class AnnotationContextRegisterBeanMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        IBean appConfig = context.getBean(IBean.class);
        System.out.println(appConfig.getData());
        System.out.println(appConfig.getNum());
    }
}
