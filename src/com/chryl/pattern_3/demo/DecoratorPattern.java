package com.chryl.pattern_3.demo;

/**
 * 装饰模式:demo-2
 * 装扮模式第二版
 * <p>
 * Created By Chr on 2019/7/8.
 */
public class DecoratorPattern {

    //待装扮对象
    static class Person {
        private String name;

        public Person() {
        }

        public Person(String name) {
            this.name = name;
        }

        //展示穿着
        public void show() {
            System.out.println(name);
        }

    }

    //服装/装扮类
    static class Finery extends Person {
        private Person person;

        //        public void setPerson(Person person) {
//            this.person = person;
//        }

        //打扮
        public void decorator(Person person) {
            this.person = person;
        }

        @Override
        public void show() {
            if (person != null) {
                person.show();
            }
        }
    }

    //具体服装
    static class TShirts extends Finery {
        @Override
        public void show() {
            System.out.println("t-shirt");
            super.show();
        }
    }

    static class Sweater extends Finery {
        @Override
        public void show() {
            System.out.println("毛衣");
            super.show();
        }
    }

    static class Shorts extends Finery {
        @Override
        public void show() {
            System.out.println("短裤");
            super.show();
        }
    }

    static class Sandal extends Finery {
        @Override
        public void show() {
            System.out.println("凉鞋");
            super.show();

        }
    }

    public static void main(String args[]) {
        Person person = new Person("xc");
        TShirts tShirts = new TShirts();
        Sweater sweater = new Sweater();
        Sandal sandal = new Sandal();
        Shorts shorts = new Shorts();
        //
        tShirts.decorator(person);
        shorts.decorator(person);
        sandal.decorator(person);

//        shorts.show();
//        tShirts.show();
        sandal.show();
    }
}
