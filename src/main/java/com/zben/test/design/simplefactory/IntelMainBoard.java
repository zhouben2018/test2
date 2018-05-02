package com.zben.test.design.simplefactory;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:04 2018/4/26
 */
public class IntelMainBoard implements MainBoard {

    /**
     * Cpu插槽的孔数
     */
    private int cpuHoles = 0;

    public IntelMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    public void installCPU() {
        System.out.println("Intel主板的CPU插槽孔数是：" + cpuHoles);
    }
}
