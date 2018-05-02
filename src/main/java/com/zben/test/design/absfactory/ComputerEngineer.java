package com.zben.test.design.absfactory;

import com.zben.test.design.simplefactory.Cpu;
import com.zben.test.design.simplefactory.MainBoard;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:33 2018/4/26
 */
public class ComputerEngineer {
    private Cpu cpu = null;
    private MainBoard mainBoard = null;
    
    public void makeComputer(AbstractFatory abstractFatory) {
        prepareHardWares(abstractFatory);
    }

    private void prepareHardWares(AbstractFatory abstractFatory) {
        //直接找相应的工厂获取
        this.cpu = abstractFatory.createCpu();
        this.mainBoard = abstractFatory.createMainBoard();

        //测试配件是否好用
        this.cpu.calculate();
        this.mainBoard.installCPU();
    }
}
