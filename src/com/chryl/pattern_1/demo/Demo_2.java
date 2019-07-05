package com.chryl.pattern_1.demo;

import java.util.Scanner;

/**
 * 简单工厂模式:实现计算器:demo-2:
 * switch case
 * <p>
 * Created By Chr on 2019/7/5.
 */
public class Demo_2 {
    public static void main(String args[]) {

        try {
            System.out.println("请输入你的第一数");
            String firNumber = new Scanner(System.in).next();
            System.out.println("请输入运算符号");
            String strOper = new Scanner(System.in).next();
            System.out.println("请输入你的第二数");
            String secNumber = new Scanner(System.in).next();
            //
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
        } catch (NumberFormatException e) {
            System.out.println("输入有误: " + e.getMessage());
        }
    }
}
