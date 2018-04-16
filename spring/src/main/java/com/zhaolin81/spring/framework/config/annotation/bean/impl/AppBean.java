package com.zhaolin81.spring.framework.config.annotation.bean.impl;

import com.zhaolin81.spring.framework.config.annotation.bean.IBean;

/**
 * Created by zhaolin on 4/16/2018.
 */
public class AppBean implements IBean {
    private String name;
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
}
