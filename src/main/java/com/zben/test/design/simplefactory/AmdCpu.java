package com.zben.test.design.simplefactory;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:03 2018/4/26
 */
public class AmdCpu implements Cpu {

    /**
     * cpu的针脚数
     */
    private int pins = 0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("AMD CPU的针脚数：" + pins);
    }
}
