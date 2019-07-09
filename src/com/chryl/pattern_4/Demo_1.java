package com.chryl.pattern_4;

/**
 * 代理模式demo-1
 * 第一版:无代理模式的代码,完全就是追求者自己送的mm,并无代理者,不符合逻辑
 * <p>
 * Created By Chr on 2019/7/9.
 */
public class Demo_1 {
    static class Pursuit1 {
        SchoolGirl1 schoolGirl1;

        public Pursuit1(SchoolGirl1 schoolGirl) {
            this.schoolGirl1 = schoolGirl;
        }

        //送礼物
        public void giveWawa() {
            System.out.println("song wawa");
        }

        public void giveFlower() {
            System.out.println("song fafa");

        }

        public void giveChoolate() {
            System.out.println("song coco");

        }
    }

    static class SchoolGirl1 {
        private String name;

        public SchoolGirl1(String name) {
            this.name = name;
        }
    }

    public static void main(String args[]) {
        String name = "lily";
        SchoolGirl1 schoolGirl = new SchoolGirl1(name);
        Pursuit1 pursuit = new Pursuit1(schoolGirl);
        pursuit.giveChoolate();
        pursuit.giveFlower();
        pursuit.giveWawa();
    }
}
