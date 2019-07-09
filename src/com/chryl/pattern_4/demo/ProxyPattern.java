package com.chryl.pattern_4.demo;

/**
 * 代理模式demo-2
 * 第三版:
 * <p>
 * Created By Chr on 2019/7/9.
 */
public class ProxyPattern {

    //代理接口
    interface IGiveGift {
        void giveWawa();

        void giveFlower();

        void giveChoolate();
    }

    //mm
    static class SchoolGirl {
        private String name;

        public SchoolGirl(String name) {
            this.name = name;
        }
    }

    //追求者追求mm,追求者认识mm
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
        public void giveChoolate() {
            System.out.println(" song coco");
        }
    }

    //因为不是他真的去送,他找代理实现 ,从而送礼物
    static class Proxy implements IGiveGift {

        //代理追求者
        Pursuit pursuit;

        /**
         * 重点
         * 代理就是代理
         * mm传入代理类之后,代理类传递给追求者,最终由追求者追mm
         *
         * @param schoolGirl
         */
        public Proxy(SchoolGirl schoolGirl) {
            pursuit = new Pursuit(schoolGirl);
        }

        @Override
        public void giveWawa() {
            pursuit.giveWawa();
        }

        @Override
        public void giveFlower() {
            pursuit.giveFlower();
        }

        @Override
        public void giveChoolate() {
            pursuit.giveChoolate();
        }
    }


    public static void main(String args[]) {

    }
}
