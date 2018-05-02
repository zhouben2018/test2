package com.zben.test.design.builder;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午4:01 2018/4/26
 */
public class Director {
    //持有当前需要使用的建造器对象
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
    }
}
