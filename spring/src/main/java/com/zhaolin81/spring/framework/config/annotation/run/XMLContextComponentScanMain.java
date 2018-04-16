package com.zhaolin81.spring.framework.config.annotation.run;

import com.zhaolin81.spring.framework.config.annotation.bean.IBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaolin on 4/16/2018.
 */
public class XMLContextComponentScanMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("componentscan_config_bean.xml");
        context.refresh();
        IBean appBean = (IBean)context.getBean("appBean");
        System.out.println(appBean);
    }
}
