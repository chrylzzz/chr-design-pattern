package com.chryl.pattern_2.myTest;

/**
 * Created By Chr on 2019/7/8.
 */
public class ReturnWay extends AbstractBaseMarketPay {

    //满减需要金额
    private double returnSumMoney = 0D;
    //减金额
    private double returnMoney = 0D;

    public ReturnWay(double returnSumMoney, double returnMoney) {
        this.returnSumMoney = returnSumMoney;
        this.returnMoney = returnMoney;
    }

    @Override
    public double accountWay(double money) {
        if (money > returnSumMoney) {
            money = money - (Math.floor(money / returnSumMoney) * returnMoney);
        }
        return money;
    }
}
