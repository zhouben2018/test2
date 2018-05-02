package com.zben.test.design.absfactory;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:35 2018/4/26
 */
public class Client {
    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFatory abstractFatory = new InterFactory();
        computerEngineer.makeComputer(abstractFatory);
    }
}
