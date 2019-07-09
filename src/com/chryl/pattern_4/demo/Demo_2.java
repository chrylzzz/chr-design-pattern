package com.chryl.pattern_4.demo;

/**
 * 代理模式demo-2
 * 第二版:只有代理的代码,完全就是代理者送的mm,没有体现追求者的存在,不符合逻辑
 * <p>
 * Created By Chr on 2019/7/9.
 */
public class Demo_2 {
    static class SchoolGirl2 {
        private String name;

        public SchoolGirl2(String name) {
            this.name = name;
        }
    }

    static class Proxy2 {
        SchoolGirl2 schoolGirl2;

        public Proxy2(SchoolGirl2 schoolGirl2) {
            this.schoolGirl2 = schoolGirl2;
        }

        //送礼物
        public void giveWawa() {
            System.out.println("song wawa");
        }

        public void giveFlower() {
            System.out.println("song fafa");

        }

        public void giveChoolate() {
            System.out.println(" song coco");

        }
    }

    public static void main(String args[]) {
        String name = "lily";
        SchoolGirl2 schoolGirl = new SchoolGirl2(name);
        Proxy2 proxy= new Proxy2(schoolGirl);
        proxy.giveChoolate();
        proxy.giveFlower();
        proxy.giveWawa();
    }
}
