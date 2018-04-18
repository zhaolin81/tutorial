package com.zhaolin81.spring.framework.configproperties.annotation.properties;

import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessorRegistrar;
import org.springframework.context.annotation.Import;

/**
 * Created by zhaolin on 4/18/2018.
 */
//@EnableConfigurationProperties()
@Import(ConfigurationPropertiesBindingPostProcessorRegistrar.class)
public class EnableSwitch {
}
