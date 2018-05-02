package com.zben.test.design.simplefactory;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:01 2018/4/26
 */
public class InterCpu implements Cpu {

    /**
     * cpu的针脚数
     */
    private int pins = 0;

    public InterCpu(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("Intel CPU针脚数:" + pins);
    }
}
