package com.chryl.pattern_2.demo;

/**
 * 策略模式:商场促销,测试demo-3
 * 策略及算法,算法可以变化替换,对算法封装,封装变化点
 * 一个抽象策略基类,多个具体策略子类,策略基类被聚合
 * <p>
 * Created By Chr on 2019/7/6.
 */
public class Demo_3 {
    public abstract static class Strategy3 {
        public abstract void algorithmCash();
    }

    //算法a
    private static class CashNormal3 extends Strategy3 {

        @Override
        public void algorithmCash() {
            System.out.println("正常");
        }
    }

    //算法b
    private static class CashRebate3 extends Strategy3

    {

        @Override
        public void algorithmCash() {
            System.out.println("打折");

        }
    }

    //算法c
    private static class CashReturn3 extends Strategy3 {

        @Override
        public void algorithmCash() {
            System.out.println("返利");

        }
    }

    //context 聚合类
    public static class CashContext3 {
        //聚合策略算法
        Strategy3 strategy;

        public CashContext3(Strategy3 strategy) {
            this.strategy = strategy;
        }

        //上下文接口
        public void runContextInterface() {
            strategy.algorithmCash();
        }

    }


    public static void main(String args[]) {
        CashContext3 cashContext = null;

        cashContext = new CashContext3(new CashNormal3());
        cashContext.runContextInterface();

        cashContext = new CashContext3(new CashRebate3());
        cashContext.runContextInterface();

        cashContext = new CashContext3(new CashReturn3());
        cashContext.runContextInterface();

    }

}
