package com.cenyol.study.models;

/**
 * Created by cenyol on 18/03/2017.
 */
public class ReentrantSuperClass {
    public synchronized void a(){
        System.out.println("---parent class：begin.....childMethod");
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("---parent class：end.....childMethod");
    }
}
