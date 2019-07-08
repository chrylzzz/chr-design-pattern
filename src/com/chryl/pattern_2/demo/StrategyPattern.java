package com.chryl.pattern_2.demo;

/**
 * 策略模式:商场促销,测试demo-4
 * 实现商场促销的策略模式:商城优惠活动使用聚合方式，实例化使用工程模式
 * 关键：
 * 策略模式聚合多种算法(策略)。
 * 简单工厂模式用来实例化多种算法(策略)
 * <p>
 * Created By Chr on 2019/7/6.
 */
public class StrategyPattern {
    /**
     * 策略模式：定义一系列算法，所有的算法只是实现不同，但是调用的方式相同,策略模式就是来封装算法的
     * 策略模式就是用来封装算法的。
     */
    public static void main(String args[]) {
        double sum = 1100D;
        CashContext cashContext = new CashContext("满500减200");
        CashContext cashContext8 = new CashContext("8折");
        double v = cashContext.getResult(sum);
        double v8 = cashContext8.getResult(sum);
        System.out.println(v);
        System.out.println(v8);
    }

    //基类
    public abstract static class CashBase {
        public abstract double acceptCash(double money);
    }

    //正常
    public static class CashNormal extends CashBase {

        @Override
        public double acceptCash(double money) {
            return money;
        }
    }

    //打折
    public static class CashRebate extends CashBase {
        private double rebate = 1D;

        public CashRebate(double rebate) {
            this.rebate = rebate;
        }

        @Override
        public double acceptCash(double money) {
            return money * rebate;
        }
    }

    //返利
    public static class CashReturn extends CashBase {

        //打折条件
        private double moneyCondition = 0D;
        //打折金额
        private double rebetMoneyCondition = 0D;

        public CashReturn(double moneyCondition, double rebetMoneyCondition) {
            this.moneyCondition = moneyCondition;
            this.rebetMoneyCondition = rebetMoneyCondition;
        }

        @Override
        public double acceptCash(double money) {
            if (money > moneyCondition) {
                money = money - Math.floor(money / moneyCondition) * rebetMoneyCondition;
            }
            return money;
        }
    }


    //交钱方式，策略方式
    //聚合基类
    public static class CashContext {
        //简单工厂模式
        CashBase cashBase = null;

        public CashContext(String cashType) {
            switch (cashType) {
                case "正常收费":
                    cashBase = new CashNormal();
                    break;
                case "8折":
                    cashBase = new CashRebate(0.8);
                    break;
                case "满500减200":
                    cashBase = new CashReturn(500D, 200D);
                    break;
            }
        }

        //策略context内部封装
        public double getResult(double money) {
            return cashBase.acceptCash(money);
        }
    }
}
