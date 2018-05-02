package com.zben.test.design.simplefactory;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:04 2018/4/26
 */
public class AmdMainBoard implements MainBoard {

    /**
     * Cpu插槽的孔数
     */
    private int cpuHoles = 0;

    public AmdMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    public void installCPU() {
        System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
    }
}
