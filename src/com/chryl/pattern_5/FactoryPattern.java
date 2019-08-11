package com.chryl.pattern_5;

import com.chryl.pattern_1.demo.Demo_4;

import java.util.jar.JarEntry;

/**
 * Created by Chryl on 2019/7/20.
 */
public class FactoryPattern {

    public interface IFactory {
        Operation createOperation();
    }

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

    static class AddFactory implements IFactory {
        @Override
        public Operation createOperation() {
            return new OperationAdd();
        }
    }

    class MulFactory implements IFactory {
        @Override
        public Operation createOperation() {
            return new OperationMul();
        }
    }

    class DivFactory implements IFactory {
        @Override
        public Operation createOperation() {
            return new OperationDiv();
        }
    }

    class SubFactory implements IFactory {
        @Override
        public Operation createOperation() {
            return new OperationSub();
        }
    }

    public static void main(String[] args) {
        IFactory iFactory = new AddFactory();
        Operation operation = iFactory.createOperation();

        double result = operation.getResult(1D, 2D);
        System.out.println(result);
    }

}
