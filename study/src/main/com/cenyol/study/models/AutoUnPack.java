package com.cenyol.study.models;

/**
 * Created by cenyol on 15/03/2017.
 */
public class AutoUnPack {

    public static void main(String[] args){
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;

        // 以下是各种语法糖，都是些什么乱七八糟的
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));       // "=="遇到算术运算的时候会自动拆箱，System.out.println(c.intValue() == a.intValue() + b.intValue());
        System.out.println(c.equals(a + b));    // 算术付如"+"等会自动拆箱，equal会自动包厢，System.out.println(c.equals(Integer.valueOf(a.intValue() + b.intValue())));
        System.out.println(g == (a + b));       // 这里除了自动拆箱，还他妈的有自动转型，System.out.println(g.longValue() == (long)(a.intValue() + b.intValue()));
        System.out.println(g.equals(a + b));
    }
}
