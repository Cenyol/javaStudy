package com.cenyol.study.models;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * Created by cenyol on 27/02/2017.
 */

public class TestCachedThreadPool{
    public static void main(String[] args){

        try {
            Thread.sleep(15 * 1000);
        }catch (Exception e){}

//        ExecutorService executorService = Executors.newCachedThreadPool();
      ExecutorService executorService = Executors.newFixedThreadPool(5);
//      ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100; i++){
            try {
                Thread.sleep(1005);
            }catch (Exception e){}
            executorService.execute(new TestRunnable());
        }

        try {
            Thread.sleep(1 * 100);
        }catch (Exception e){}

        System.out.println("*********************************");

        executorService.shutdown();
    }
}

class TestRunnable implements Runnable{
    public static int tmp = 1000;
    public void run(){
        System.out.println(Thread.currentThread().getName() + "线程开始执行任务。");
        System.out.println("");

//        TestRunnable.tmp += 1;

        try {
            Thread.sleep(TestRunnable.tmp);
        }catch (Exception e){}

        System.out.println(Thread.currentThread().getName() + "线程结束执行任务。");
        System.out.println("");
    }
}