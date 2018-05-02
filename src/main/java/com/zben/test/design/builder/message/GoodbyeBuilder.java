package com.zben.test.design.builder.message;

/**
 * @Author: zben
 * @Description:具体建造者
 * @Date: 下午4:27 2018/4/26
 */
public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder() {
        msg = new GoodbyeMessage();
    }

    public void buildSubject() {
        msg.setBody("欢送内容");
    }

    public void buildBody() {
        msg.setSubject("欢送标题");
    }
}
