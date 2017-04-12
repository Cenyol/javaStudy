package com.cenyol.study.models;

/**
 * Created by cenyol on 26/03/2017.
 */
public class JVMParamsTest {
    public static void main(String[] args) {
        for (int i = 0; i < args.length ; i++) {
            System.out.println("参数：" + args[i]);
        }
        System.out.println(Runtime.getRuntime().maxMemory()/1000/1000 + "M");
    }
}
