package com.zben.test.design.builder;

/**
 * @Author: zben
 * @Description:抽象建造者类
 * @Date: 下午3:57 2018/4/26
 */
public interface Builder {
    public void buildPart1();

    public void buildPart2();

    public Product result();
}
