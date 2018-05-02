package com.zben.test.design.simplefactory;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:09 2018/4/26
 */
public class ComputerEngineer {
    /**
     * 定义组装机需要的CPU
     */
    private Cpu cpu = null;
    /**
     * 定义组装机需要的主板
     */
    private MainBoard mainBoard = null;

    public void makeComputer(int cpuType, int mainBoard) {
        //1. 首先准备好装机所需的配件
        prepareHardwares(cpuType, mainBoard);
    }

    private void prepareHardwares(int cpuType, int mainBoard) {
        this.cpu = CpuFactory.createCpu(cpuType);
        this.mainBoard = MainboardFactory.createMainboard(mainBoard);

        this.cpu.calculate();
        this.mainBoard.installCPU();
    }
}





























