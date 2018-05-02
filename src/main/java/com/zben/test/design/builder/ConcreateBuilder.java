package com.zben.test.design.builder;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:59 2018/4/26
 */
public class ConcreateBuilder implements Builder {

    private Product product = new Product();

    public void buildPart1() {
        product.setPart1("编号：9527");
    }

    public void buildPart2() {
        product.setPart2("名称：xxx");
    }

    public Product result() {
        return product;
    }
}
