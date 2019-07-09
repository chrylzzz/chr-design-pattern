package com.chryl.pattern_4.demo;

/**
 * 代理模式demo-2
 * 第三版:被代理者,代理接口,代理
 * 被代理者和代理都实现代理接口;被代理者实现的是具体的方法,代理实现的是调用被代理者;
 * 而第三方通过代理传递到被代理者作为方法执行的依据
 * <p>
 * Created By Chr on 2019/7/9.
 */
public class ProxyPattern {

    //代理接口
    interface IGiveGift {
        void giveWawa();

        void giveFlower();

        void giveChocolate();
    }

    //mm即目标
    static class SchoolGirl {
        private String name;

        public SchoolGirl(String name) {
            this.name = name;
        }
    }

    //追求者即被代理者,追求mm,追求者认识mm,所以有联系
    static class Pursuit implements IGiveGift {
        SchoolGirl schoolGirl;

        public Pursuit(SchoolGirl schoolGirl) {
            this.schoolGirl = schoolGirl;
        }

        //送礼物
        @Override
        public void giveWawa() {
            System.out.println("song wawa");
        }

        @Override
        public void giveFlower() {
            System.out.println("song fafa");
        }

        @Override
        public void giveChocolate() {
            System.out.println("song coco");
        }
    }

    //代理类,因为不是他真的去送,不需要真正实现方法,只需要调用被代理类的方法发送给目标即可
    static class Proxy implements IGiveGift {

        //代理追求者
        Pursuit pursuit;

        /**
         * 重点
         * 代理就是代理,代理只是桥梁,
         * mm传入代理类之后,代理类传递给追求者,最终由追求者追mm
         *
         * @param schoolGirl
         */
        public Proxy(SchoolGirl schoolGirl) {//虽然传递给代理,但是mm最终传递到被代理者
            pursuit = new Pursuit(schoolGirl);
        }

        @Override
        public void giveWawa() {
            //使用被代理者实现的方法
            pursuit.giveWawa();
        }

        @Override
        public void giveFlower() {
            pursuit.giveFlower();
        }

        @Override
        public void giveChocolate() {
            pursuit.giveChocolate();
        }
    }


    public static void main(String args[]) {
        SchoolGirl schoolGirl = new SchoolGirl("lily");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveChocolate();
        proxy.giveFlower();
        proxy.giveWawa();
    }
}
