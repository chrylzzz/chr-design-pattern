package com.chryl.pattern_3.myMest;

/**
 * Created By Chr on 2019/7/8.
 */
public class Tshirt extends Cloth {
    @Override
    void decorator(Person person) {
        System.out.println("t-shirt");
    }
}
