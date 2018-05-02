package com.zben.test.lambda;

/**
 * @Author: zben
 * @Description:用lambda表达式实现Runnable
 * @Date: 上午11:22 2018/4/27
 */
public class RunnableLambda {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            public void run() {
                System.out.println("before java8");
            }
        }).start();

        new Thread(() -> System.out.println("in java8")).start();
    }
}
