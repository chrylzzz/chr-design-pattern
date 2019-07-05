package com.chryl.pattern_1.demo;

import java.util.Scanner;
/**
 * 简单工厂模式使用场景:
 * (1)在一堆产品中选择一个产品,可以根据参数决定生产产品的种类
 * (2)产品的种类多种多样
 * 简单工厂模式的特点:
 * (1)工厂类不具有其他功能,只负责生产各种各样的产品
 */

/**
 * 简单工厂模式:实现计算器(基于demo-4的基类和派生类)
 * 在demo-4的基础上,需要手动new 4个对象,封装new对象的工厂
 * <p>
 * Created By Chr on 2019/7/5.
 */
public class SimpleFactoryPattern {
    public static void main(String args[]) {
        System.out.println("请输入你的第一数");
        String firNumber = new Scanner(System.in).next();
        System.out.println("请输入运算符号");
        String strOper = new Scanner(System.in).next();
        System.out.println("请输入你的第二数");
        String secNumber = new Scanner(System.in).next();

        Demo_4.Operation demo4Operation = OperationFactory.create(strOper.trim());
        double result = demo4Operation.getResult(Double.valueOf(firNumber), Double.valueOf(secNumber));
        System.out.println(result);

    }


    //工厂
    public static class OperationFactory {
        public static Demo_4.Operation create(String operate) {
            //demo4中的obj
            Demo_4.Operation demoOperation = null;
            switch (operate) {
                case "+":
                    demoOperation = new Demo_4.OperationAdd();
                    break;
                case "-":
                    demoOperation = new Demo_4.OperationSub();
                    break;
                case "*":
                    demoOperation = new Demo_4.OperationMul();
                    break;
                case "/":
                    demoOperation = new Demo_4.OperationDiv();
                    break;
            }
            return demoOperation;
        }
    }


}
