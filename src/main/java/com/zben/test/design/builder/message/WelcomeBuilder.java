package com.zben.test.design.builder.message;

/**
 * @Author: zben
 * @Description:具体建造者
 * @Date: 下午4:27 2018/4/26
 */
public class WelcomeBuilder extends Builder {

    public WelcomeBuilder() {
        msg = new WelcomeMessage();
    }

    public void buildSubject() {
        msg.setBody("欢迎内容");
    }

    public void buildBody() {
        msg.setSubject("欢迎标题");
    }
}
