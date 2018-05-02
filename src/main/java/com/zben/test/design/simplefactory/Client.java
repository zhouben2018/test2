package com.zben.test.design.simplefactory;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:14 2018/4/26
 */
public class Client {

    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();

        computerEngineer.makeComputer(1, 2);
    }
}
