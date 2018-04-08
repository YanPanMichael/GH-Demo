package com.android.test.demo.http;

import com.alibaba.fastjson.JSON;
import com.android.test.joor.Test;

import org.json.JSONObject;

/**
 * des:
 * author: libingyan
 * Date: 18-4-8 14:48
 */
public class TestBean implements HttpResult {

    private String name;

    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public TestBean parse(String content) throws Exception {
        //return JSON.parseObject(content, TestBean.class);
        return this;
    }
}
