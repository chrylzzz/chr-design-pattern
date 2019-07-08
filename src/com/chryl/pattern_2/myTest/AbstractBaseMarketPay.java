package com.chryl.pattern_2.myTest;

/**
 * 策略模式:封装商场多个结算方法(封装多个算法)
 * 与工厂模式并用
 * <p>
 * Created By Chr on 2019/7/8.
 */
public abstract class AbstractBaseMarketPay {

    /**
     *
     * @param money 商品金额
     * @return 实付
     */
    public abstract double accountWay(double money);

}
