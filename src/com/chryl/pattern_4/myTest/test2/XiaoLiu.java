package com.chryl.pattern_4.myTest.test2;

/**
 * Created by Chryl on 2019/7/20.
 */
public class XiaoLiu extends LiWu {

    XiuCai xiuCai;

    public XiaoLiu(XiaoGuo xiaoGuo) {
        xiuCai = new XiuCai(xiaoGuo);
    }

    @Override
    public void giveFaFa() {
        xiuCai.giveFaFa();
    }

    @Override
    public void giveQKL() {
        xiuCai.giveQKL();
    }

    @Override
    public void giveWaWa() {
        xiuCai.giveWaWa();
    }
}
