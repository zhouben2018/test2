package com.zben.test.design.absfactory;

import com.zben.test.design.simplefactory.AmdCpu;
import com.zben.test.design.simplefactory.AmdMainBoard;
import com.zben.test.design.simplefactory.Cpu;
import com.zben.test.design.simplefactory.MainBoard;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:31 2018/4/26
 */
public class AmdFactory implements AbstractFatory {
    public Cpu createCpu() {
        return new AmdCpu(938);
    }

    public MainBoard createMainBoard() {
        return new AmdMainBoard(938);
    }
}
