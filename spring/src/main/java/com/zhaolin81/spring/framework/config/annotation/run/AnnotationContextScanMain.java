package com.zhaolin81.spring.framework.config.annotation.run;

import com.zhaolin81.spring.framework.config.annotation.bean.IBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhaolin on 4/16/2018.
 */
public class AnnotationContextScanMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.zhaolin81.spring.framework.config.annotation.appconfig");
        context.refresh();
        IBean appBean = (IBean)context.getBean("appBean");
        System.out.println(appBean);
    }
}
