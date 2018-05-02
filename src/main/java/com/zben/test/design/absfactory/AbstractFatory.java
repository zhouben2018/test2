package com.zben.test.design.absfactory;

import com.zben.test.design.simplefactory.Cpu;
import com.zben.test.design.simplefactory.MainBoard;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:28 2018/4/26
 */
public interface AbstractFatory {
    /**
     * 创建CPU对象
     */
    public Cpu createCpu();

    /**
     * 创建主板对象
     */
    public MainBoard createMainBoard();
}
