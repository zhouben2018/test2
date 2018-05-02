package com.zben.test.design.simplefactory;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:07 2018/4/26
 */
public class CpuFactory {

    public static Cpu createCpu(int type) {
        Cpu cpu = null;
        if (type == 1) {
            cpu = new InterCpu(755);
        } else if (type == 2) {
            cpu = new AmdCpu(938);
        }
        return cpu;
    }
}
