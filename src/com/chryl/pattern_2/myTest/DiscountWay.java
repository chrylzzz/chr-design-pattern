package com.chryl.pattern_2.myTest;

/**
 * Created By Chr on 2019/7/8.
 */
public class DiscountWay extends AbstractBaseMarketPay {

    //?折
    private double discountNum = 1D;

    public DiscountWay(double discountNum) {
        this.discountNum = discountNum;
    }

    @Override
    public double accountWay(double money) {
        return money * discountNum;
    }
}
