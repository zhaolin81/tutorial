package com.zhaolin81.spring.framework.configproperties.annotation.bean.impl;


import com.zhaolin81.spring.framework.configproperties.annotation.bean.IBean;

/**
 * Created by zhaolin on 4/16/2018.
 */
public class AppBean implements IBean {
    private String data;
    private int num;

    @Override
    public String getData() {
        return data;
    }
    @Override
    public void setData(String data) {
        this.data = data;
    }
    @Override
    public int getNum() {
        return num;
    }
    @Override
    public void setNum(int num) {
        this.num = num;
    }
}
