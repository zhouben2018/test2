package com.zben.test.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午8:23 2018/4/27
 */
public class MapLambda {

    public static void main(String[] args) {
        List<Double> cost = Arrays.asList(10.0, 20.0, 30.0);
        cost.stream().map(x -> x + x * 0.05).forEach(x -> System.out.println(x));
    }
}
