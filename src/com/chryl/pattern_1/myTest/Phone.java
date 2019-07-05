package com.chryl.pattern_1.myTest;

/**
 * Created By Chr on 2019/7/5.
 */
public class Phone {

    private String phoneName;
    private String phoneDescription;
    private String phoneColor;
    private double phonePrice;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneDescription() {
        return phoneDescription;
    }

    public void setPhoneDescription(String phoneDescription) {
        this.phoneDescription = phoneDescription;
    }

    public String getPhoneColor() {
        return phoneColor;
    }

    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }

    public double getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(double phonePrice) {
        this.phonePrice = phonePrice;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneName='" + phoneName + '\'' +
                ", phoneDescription='" + phoneDescription + '\'' +
                ", phoneColor='" + phoneColor + '\'' +
                ", phonePrice=" + phonePrice +
                '}';
    }
}
