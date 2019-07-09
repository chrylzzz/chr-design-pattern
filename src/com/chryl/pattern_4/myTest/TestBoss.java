package com.chryl.pattern_4.myTest;

/**
 * 被代理类
 * <p>
 * Created By Chr on 2019/7/9.
 */
public class TestBoss implements TestIGiveLife {

    //需要传话的员工
    TestStaff staff;

    public TestBoss(TestStaff staff) {
        this.staff = staff;
    }

    @Override
    public void sendMessage1() {
        System.out.println("msg 1");
    }

    @Override
    public void sendMessage2() {
        System.out.println("msg 2");
    }

    @Override
    public void sendMessage3() {
        System.out.println("msg 3");
    }
}
