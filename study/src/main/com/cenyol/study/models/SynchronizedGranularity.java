package com.cenyol.study.models;

import java.util.concurrent.TimeUnit;

/**
 * Created by cenyol on 10/03/2017.
 * synchronized的粒度验证
 */
public class SynchronizedGranularity {
    public static void main(String args[]){
//        int i = 0;
//        i += 2.1;
//        i = i + 2.1;
        User user = new User();
        new MyThread(user).start();
        new MyThread1(user).start();
    }
}

class MyThread extends Thread{
    private User user = null;
    public MyThread(User user){
        this.user = user;
    }

    public void run() {
        user.c();
    }
}
class MyThread1 extends Thread{
    private User user = null;
    public MyThread1(User user){
        this.user = user;
    }

    public void run() {
        user.a();
    }
}

class User{
    private static int sleepSeconds = 2;
    public synchronized void a(){
        try {
            System.out.println("进入synchronized方法A");
            TimeUnit.SECONDS.sleep(sleepSeconds);
            System.out.println(sleepSeconds + "秒后，离开synchronized方法A");
        }catch (Exception e){}
    }
    public synchronized void b(){
        try {
            System.out.println("进入synchronized方法B");
            TimeUnit.SECONDS.sleep(sleepSeconds);
            System.out.println(sleepSeconds + "秒后，离开synchronized方法B");
        }catch (Exception e){}

    }

    public static synchronized void c(){
        try {
            System.out.println("进入static synchronized方法C");
            TimeUnit.SECONDS.sleep(sleepSeconds);
            System.out.println(sleepSeconds + "秒后，离开static synchronized方法C");
        }catch (Exception e){}
    }

    public static synchronized void d(){
        try {
            System.out.println("进入static synchronized方法D");
            TimeUnit.SECONDS.sleep(sleepSeconds);
            System.out.println(sleepSeconds + "秒后，离开static synchronized方法D");
        }catch (Exception e){}
    }
}
