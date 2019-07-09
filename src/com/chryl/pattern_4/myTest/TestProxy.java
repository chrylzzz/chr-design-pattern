package com.chryl.pattern_4.myTest;

/**
 * 代理
 * <p>
 * Created By Chr on 2019/7/9.
 */
public class TestProxy implements TestIGiveLife {

    //被代理对象
    private TestBoss boss;

    //代理核心
    public TestProxy(TestStaff staff) {
        boss = new TestBoss(staff);
    }

    @Override
    public void sendMessage1() {
        boss.sendMessage1();
    }

    @Override
    public void sendMessage2() {
        boss.sendMessage2();
    }

    @Override
    public void sendMessage3() {
        boss.sendMessage3();
    }


    public static void main(String args[]) {
        TestStaff staff = new TestStaff("xiaoliu");
        TestProxy proxy = new TestProxy(staff);
        proxy.sendMessage1();
        proxy.sendMessage2();
        proxy.sendMessage3();

    }
}
