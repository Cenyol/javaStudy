package com.cenyol.study;
import com.cenyol.study.models.Calculator;

import java.io.*;
import java.lang.reflect.Field;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) throws Exception{
//        Integer a = 1000, b = 1000;
//        System.out.println(a == b);//1
//        Integer c = 100, d = 100;
//        System.out.println(c == d);//2
////
//        int a1 = 1000, b1 = 1000;
//        System.out.println(a1 == b1);//1
//        int c1 = 100, d1 = 100;
//        System.out.println(c1 == d1);//2

//        System.out.println(1<<0);
//        System.out.println(1<<1);
//        System.out.println(1<<30);
//        System.out.println(Math.pow(2, 30));

        List<Calculator> list = new ArrayList<Calculator>();
        while (true){
            list.add(new Calculator());

            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
//        changeStringValue();
    }

    public static void changeStringValue() throws Exception{
        String string = "hello world!";

        Field valueMemberOfString = String.class.getDeclaredField("value");
        valueMemberOfString.setAccessible(true);

        char[] value = (char[])valueMemberOfString.get(string);
        value[5] = '-';
        System.out.println(string);
    }
}