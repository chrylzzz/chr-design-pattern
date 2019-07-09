package com.chryl.pattern_3.demo;

/**
 * 装饰模式:demo-1
 * 该类为熟悉结构类
 * <p>
 * Created By Chr on 2019/7/8.
 */
public class Demo_1 {

    //装饰接口
    abstract static class Component1 {
        public abstract void operation();
    }

    //待装饰对象
    static class ConcreteComponent1 extends Component1 {

        @Override
        public void operation() {
            System.out.println("待装饰");
        }
    }

    abstract static class Decorator1 extends Component1 {
        protected Component1 component;

        //set
        public void setComponent(Component1 component) {
            this.component = component;
        }

        @Override
        public void operation() {
            if (component != null) {
                component.operation();
            }
        }
    }

    //装饰器A
    static class ConcreteDecoratorA extends Decorator1 {
        private String addState;

        @Override
        public void operation() {
            super.operation();
            addState = "new State";
            System.out.println("具体装饰A操作");
        }
    }

    //装饰器B
    static class ConcreteDecoratorB extends Decorator1 {

        @Override
        public void operation() {
            super.operation();
            addedBehavior();
            System.out.println("具体装饰B操作");
        }

        private void addedBehavior() {

        }
    }

    public static void main(String args[]) {
        ConcreteComponent1 concreteComponent = new ConcreteComponent1();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteComponent);
        concreteDecoratorB.operation();
//        concreteDecoratorA.operation();

    }
}
