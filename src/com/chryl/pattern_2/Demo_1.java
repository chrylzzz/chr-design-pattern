package com.chryl.pattern_2;

import java.util.Scanner;

/**
 * 策略模式:商场促销系统demo-1:
 * 基本的计算
 * <p>
 * Created By Chr on 2019/7/5.
 */
public class Demo_1 {

    public static void main(String args[]) {
        System.out.println("请输入你的商品单价");
        String strPrice = new Scanner(System.in).next();
        System.out.println("请输入商品数量");
        String strTotal = new Scanner(System.in).next();
    }

    double total = 0D;

    public void getTotal(String strPrice, String strTotal) {
        total = Double.valueOf(strPrice) * Double.valueOf(strTotal);
        System.out.println(total);

    }
}
