package com.chryl.pattern_3.demo;

/**
 * 装饰模式:demo-1未实现
 * 该类为熟悉结构类
 * <p>
 * Created By Chr on 2019/7/8.
 */
public interface Demo_1 {

    //待装饰的接口
    interface Component {
        void method();
    }

    //实现类俗称的原始对象，或者说待装饰对象。
    class ConcreteComponent implements Component {

        public void method() {
            System.out.println("需要装饰的对象");
        }

    }

    //抽象装饰器父类，它主要是为装饰器定义了我们需要装饰的目标是什么，并对Component进行了基础的装饰
    abstract class Decorator implements Component {

        protected Component component;

        public Decorator(Component component) {
            super();
            this.component = component;
        }

        @Override
        public void method() {
            this.component.method();
        }
    }


    //装饰器A
    class ConcreteDecoratorA extends Decorator {

        public ConcreteDecoratorA(Component component) {
            super(component);
        }

        public void show() {
            //需要装饰的对象
            component.method();
            System.out.println();
        }
    }

    //装饰器B
    class ConcreteDecoratorB extends Decorator {

        public ConcreteDecoratorB(Component component) {
            super(component);
        }

        public void show() {
            //需要装饰的对象
            this.component.method();
            System.out.println();
        }
    }


}
