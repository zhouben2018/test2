package com.zben.test.design.builder;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午4:03 2018/4/26
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreateBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.result();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
