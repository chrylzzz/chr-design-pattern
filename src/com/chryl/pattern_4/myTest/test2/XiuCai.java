package com.chryl.pattern_4.myTest.test2;

/**
 * Created by Chryl on 2019/7/20.
 */
public class XiuCai extends LiWu {

    XiaoGuo xiaoGuo;

    public XiuCai(XiaoGuo xiaoGuo) {
        this.xiaoGuo = xiaoGuo;
    }

    @Override
    public void giveFaFa() {
        System.out.println("送fafa");
    }

    @Override
    public void giveQKL() {
        System.out.println("song巧克力");
    }

    @Override
    public void giveWaWa() {
        System.out.println("送wawa'");
    }
}
