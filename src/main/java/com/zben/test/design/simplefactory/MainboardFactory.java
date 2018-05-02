package com.zben.test.design.simplefactory;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午3:07 2018/4/26
 */
public class MainboardFactory {

    public static MainBoard createMainboard(int type) {
        MainBoard mainBoard = null;
        if (type == 1) {
            mainBoard = new IntelMainBoard(755);
        } else if (type == 2) {
            mainBoard = new AmdMainBoard(938);
        }
        return mainBoard;
    }
}
