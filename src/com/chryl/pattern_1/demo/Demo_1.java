package com.chryl.pattern_1.demo;

import java.util.Scanner;

/**
 * 简单工厂模式:实现计算器:demo-1
 * if-elseif
 * <p>
 * Created By Chr on 2019/7/5.
 */
public class Demo_1 {
    public static void main(String args[]) {

        System.out.println("请输入你的第一数");
        String firNumber = new Scanner(System.in).next();
        System.out.println("请输入运算符号");
        String strOper = new Scanner(System.in).next();
        System.out.println("请输入你的第二数");
        String secNumber = new Scanner(System.in).next();
        //
        String oper = strOper.trim();
        double value = 0;
        if (oper.equals("+")) {
            value = Double.valueOf(firNumber) + Double.valueOf(secNumber);
        } else if (oper.equals("-")) {
            value = Double.valueOf(firNumber) - Double.valueOf(secNumber);
        } else if (oper.equals("*")) {
            value = Double.valueOf(firNumber) * Double.valueOf(secNumber);
        } else if (oper.equals("/")) {
            value = Double.valueOf(firNumber) / Double.valueOf(secNumber);
        }
        System.out.println(value);
    }
}
