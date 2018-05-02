package com.zben.test.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: zben
 * @Description:用lambda迭代
 * @Date: 下午7:40 2018/4/27
 */
public class ItLambda {

    public static void main(String[] args) {
        //java8之前
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream APi");
        for (String feature : features) {
            System.out.println(feature);
        }
        //java 8之后
        List<String> features2 = Arrays.asList("Lambdas", "Default Method", "Stream APi");
        features2.forEach(System.out::println);

    }


}
