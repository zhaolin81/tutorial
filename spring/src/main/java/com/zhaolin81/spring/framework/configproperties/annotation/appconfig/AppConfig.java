package com.zhaolin81.spring.framework.configproperties.annotation.appconfig;

import com.zhaolin81.spring.framework.configproperties.annotation.bean.IBean;
import com.zhaolin81.spring.framework.configproperties.annotation.bean.impl.AppBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhaolin on 4/18/2018.
 */
@Configuration
@EnableConfigurationProperties()
public class AppConfig {
//    @Autowired
//    public AppConfigProperties properties;

    @Bean
    @ConfigurationProperties(prefix = "test",locations = "classpath:test.properties")
    public IBean bean(){
        return new AppBean();
    }
}
