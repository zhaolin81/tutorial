package com.zhaolin81.spring.framework.configproperties.annotation.appconfig;

import com.zhaolin81.spring.framework.configproperties.annotation.properties.AppConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhaolin on 4/18/2018.
 */
@Configuration
@EnableConfigurationProperties()
public class AppConfig {
    @Autowired
    public AppConfigProperties properties;

    @Bean
    public
    AppConfigProperties appConfigProperties(){
        return new AppConfigProperties();
    }
}
