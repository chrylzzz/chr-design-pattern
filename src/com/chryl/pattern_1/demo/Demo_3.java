package com.chryl.pattern_1.demo;

import java.util.Scanner;

/**
 * 简单工厂模式:实现计算器:demo-3:
 * demo-2.demo-1基础业务封装
 * <p>
 * Created By Chr on 2019/7/5.
 */
public class Demo_3 {
    public static void main(String args[]) {

        try {

            System.out.println("请输入你的第一数");
            String firNumber = new Scanner(System.in).next();
            System.out.println("请输入运算符号");
            String strOper = new Scanner(System.in).next();
            System.out.println("请输入你的第二数");
            String secNumber = new Scanner(System.in).next();
            //
            getResult(firNumber, secNumber, strOper);

        } catch (Exception e) {
            System.out.println("输入有误: " + e.getMessage());
        }
    }

    public static void getResult(String firNumber, String secNumber, String strOper) {

        String oper = strOper.trim();
        double value = 0;
        switch (oper) {
            case "+":
                value = Double.valueOf(firNumber) + Double.valueOf(secNumber);
                break;
            case "-":
                value = Double.valueOf(firNumber) - Double.valueOf(secNumber);
                break;
            case "*":
                value = Double.valueOf(firNumber) * Double.valueOf(secNumber);
                break;
            case "/":
                value = Double.valueOf(firNumber) / Double.valueOf(secNumber);
                break;
        }
        System.out.println(value);

    }
}
