package com.chryl.pattern_2.myTest;

/**
 * 用到了工厂模式,策略模式:
 * 策略模式:在构造里聚合
 * <p>
 * Created By Chr on 2019/7/8.
 */
public class StrategyContext {

    //聚合基类
    //工厂模式
    AbstractBaseMarketPay marketPay = null;


    //构造里进行算法
    public StrategyContext(String cashType) {
        switch (cashType) {
            case "正常收费":
                marketPay = new NormalWay();
                break;
            case "8折":
                marketPay = new DiscountWay(0.8);
                break;
            case "满500减200":
                marketPay = new ReturnWay(500D, 200D);
                break;
        }
    }

    //封装结果
    public double getResult(double money) {
        return marketPay.accountWay(money);
    }


    public static void main(String args[]) {
        StrategyContext context = new StrategyContext("满500减200");
        System.out.println(context.getResult(1500D));
    }
}
