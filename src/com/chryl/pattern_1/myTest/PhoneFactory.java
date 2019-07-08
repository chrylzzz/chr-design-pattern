package com.chryl.pattern_1.myTest;

/**
 * 一个工厂,一个基类,多个派生类,工厂根据传参生产派生类(基类)
 * <p>
 * Created By Chr on 2019/7/5.
 */
public class PhoneFactory {

    public static Phone create(String phoneName) {
        Phone phone = null;
        switch (phoneName) {
            case "iphone":
                phone = new IPhone();
                break;
            case "mphone":
                phone = new MiPhone();
                break;
        }
        return phone;
    }

}
