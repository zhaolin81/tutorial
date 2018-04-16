package com.zhaolin81.spring.framework.config.annotation.appconfig;

import com.zhaolin81.spring.framework.config.annotation.bean.IBean;
import com.zhaolin81.spring.framework.config.annotation.bean.impl.AppBean;
import com.zhaolin81.spring.framework.config.annotation.otherconfig.DatabaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * Created by zhaolin on 4/16/2018.
 */
@Configuration
@ComponentScan("abc.xxx")
//@Import(DatabaseConfig.class)
//@ImportResource("classpath:config_other_bean.xml")
public class AppConfig {
    @Autowired
    public Environment env;

    @Value("file.encoding")
    public String encoding;

    @Autowired
    public DataSource dataSource;

    @Configuration
    public static class DatabaseConfig{
        @Bean
        DataSource dataSource(){
            return new DataSource() {
                @Override
                public Connection getConnection() throws SQLException {
                    return null;
                }

                @Override
                public Connection getConnection(String username, String password) throws SQLException {
                    return null;
                }

                @Override
                public <T> T unwrap(Class<T> iface) throws SQLException {
                    return null;
                }

                @Override
                public boolean isWrapperFor(Class<?> iface) throws SQLException {
                    return false;
                }

                @Override
                public PrintWriter getLogWriter() throws SQLException {
                    return null;
                }

                @Override
                public void setLogWriter(PrintWriter out) throws SQLException {

                }

                @Override
                public void setLoginTimeout(int seconds) throws SQLException {

                }

                @Override
                public int getLoginTimeout() throws SQLException {
                    return 0;
                }

                @Override
                public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                    return null;
                }
            };
        }
    }
    @Bean
    IBean appBean(){
        AppBean appBean = new AppBean();
        appBean.setName(env.getProperty("xxx"));
        return appBean;
    }

}
