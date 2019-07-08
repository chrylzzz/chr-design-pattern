package com.chryl.pattern_2.demo;

/**
 * 策略模式demo-2:
 * 使用简单工厂模式：商场促销的多种情况
 * <p>
 * Created by Administrator on 2019/7/6.
 */
public class Demo_2 {

    //原价收费
    public static class CashNormal2 extends CashBase2 {

        @Override
        public double acceptCash(double money) {
            return money;
        }
    }

    //打折收费
    public static class CashRebate2 extends CashBase2 {
        //折扣
        private double rebate = 1D;

        public CashRebate2(double rebate) {
            this.rebate = rebate;
        }

        @Override
        public double acceptCash(double money) {
            return money * rebate;
        }
    }

    //返利
    public static class CashReturn2 extends CashBase2 {
        //返利金额标准
        private double moneyCondition = 0D;
        //满减金额
        private double moneyReturn = 0D;

        public CashReturn2(double moneyCondition, double moneyReturn) {
            this.moneyCondition = moneyCondition;
            this.moneyReturn = moneyReturn;
        }

        @Override
        public double acceptCash(double money) {
            //满足几个满减,取整
            if (money > moneyCondition)
                money = money - Math.floor(money / moneyCondition) * moneyReturn;

            return money;
        }
    }


    //基类
    public static abstract class CashBase2 {
        public abstract double acceptCash(double money);
    }

    //工厂类
    public static class CashFactory2 {
        public static CashBase2 createBash(String cashType) {
            CashBase2 cashBase = null;
            switch (cashType) {
                case "正常收费":
                    cashBase = new CashNormal2();
                    break;
                case "8折":
                    cashBase = new CashRebate2(0.8);
                    break;
                case "满500减200":
                    cashBase = new CashReturn2(500, 200);
                    break;
            }
            return cashBase;
        }
    }

    public static void main(String args[]) {//////////////////////////////////////////////////////////////////////////////////////////
        double sum = 900D;
        CashBase2 cashBase = CashFactory2.createBash("满500减200");
        double v = cashBase.acceptCash(sum);
        System.out.println(v);

    }
}
