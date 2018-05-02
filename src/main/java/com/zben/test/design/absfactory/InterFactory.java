package com.zben.test.design.absfactory;

import com.zben.test.design.simplefactory.Cpu;
import com.zben.test.design.simplefactory.IntelMainBoard;
import com.zben.test.design.simplefactory.InterCpu;
import com.zben.test.design.simplefactory.MainBoard;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:30 2018/4/26
 */
public class InterFactory implements AbstractFatory {

    public Cpu createCpu() {
        return new InterCpu(755);
    }

    public MainBoard createMainBoard() {
        return new IntelMainBoard(755);
    }
}
