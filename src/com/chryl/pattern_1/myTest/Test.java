package com.chryl.pattern_1.myTest;

/**
 * 模拟工厂模式
 * <p>
 * Created By Chr on 2019/7/5.
 */
public class Test {
    public static void main(String args[]) {
        String name = "iphone";
        Phone phone = PhoneFactory.create(name);
        phone.setPhoneName("iphone6s");
        phone.setPhoneColor("white");
        phone.setPhonePrice(3999D);
        phone.setPhoneDescription("最好的iphone");
        System.out.println(phone);
    }
}
