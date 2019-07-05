package com.chryl.pattern_1.demo;

import java.util.Scanner;

/**
 * 简单工厂模式:实现计算器:demo-4:
 * demo-3业务封装de基础上,进行功能抽离:防止某些功能修改而导致代码全部修改
 * <p>
 * Created By Chr on 2019/7/5.
 */
public class Demo_4 {
    public static void main(String args[]) {
        try {
            System.out.println("请输入你的第一数");
            String firNumber = new Scanner(System.in).next();
            System.out.println("请输入运算符号");
            String strOper = new Scanner(System.in).next();
            System.out.println("请输入你的第二数");
            String secNumber = new Scanner(System.in).next();
            //
            Operation operation = new Operation();
            operation.setFirNumber(Double.valueOf(firNumber));
            operation.setSecNumber(Double.valueOf(secNumber));
            String oper = strOper.trim();
            double value = 0;
            if (oper.equals("+")) {
                value = new OperationAdd().getResult(operation.getFirNumber(), operation.getSecNumber());
            } else if (oper.equals("-")) {
                value = new OperationSub().getResult(operation.getFirNumber(), operation.getSecNumber());
            } else if (oper.equals("*")) {
                value = new OperationMul().getResult(operation.getFirNumber(), operation.getSecNumber());
            } else if (oper.equals("/")) {
                value = new OperationDiv().getResult(operation.getFirNumber(), operation.getSecNumber());
            }
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("输入有误: " + e.getMessage());
        }

    }

    //基类
    public static class Operation {
        //父类 private 不会传递给子类
        private double firNumber;
        private double secNumber;

        public double getFirNumber() {
            return firNumber;
        }

        public void setFirNumber(double firNumber) {
            this.firNumber = firNumber;
        }

        public double getSecNumber() {
            return secNumber;
        }

        public void setSecNumber(double secNumber) {
            this.secNumber = secNumber;
        }

        public double getResult(double firNumber, double secNumber) {
            double result = 0;
            return result;
        }
    }

    //派生类
    public static class OperationAdd extends Operation {
        @Override
        public double getResult(double firNumber, double secNumber) {
            return firNumber + secNumber;
        }
    }

    public static class OperationSub extends Operation {
        @Override
        public double getResult(double firNumber, double secNumber) {
            return firNumber - secNumber;
        }
    }

    public static class OperationMul extends Operation {
        @Override
        public double getResult(double firNumber, double secNumber) {
            return firNumber * secNumber;
        }
    }

    public static class OperationDiv extends Operation {
        @Override
        public double getResult(double firNumber, double secNumber) {
            return firNumber / secNumber;
        }
    }
}
