package com.cenyol.study.models;

import java.util.concurrent.TimeUnit;

/**
 * Created by cenyol on 10/03/2017.
 * wait与sleep的区别：wait阻塞的时候会释放锁，此时其他线程可进入；而sleep不会释放，这时其他线程是进不来的，仍然需要继续等待
 * notify与notifyAll，前者一次唤醒一个阻塞的线程，后者一次性唤醒所有的线程
 */
public class WaitAndNotify {
    public static void main(String[] args) {
        Object co = new Object();
        System.out.println(co);

        for (int i = 0; i < 5; i++) {
            MyThread t = new MyThread("Thread" + i, co);
            t.start();
        }

        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("-----Main Thread notify-----");
            synchronized (co) {
//                co.notifyAll();
            }

            TimeUnit.SECONDS.sleep(10);
            System.out.println("Main Thread is end.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MyThread extends Thread {
        private String name;
        private Object co;

        public MyThread(String name, Object o) {
            this.name = name;
            this.co = o;
        }

        @Override
        public void run() {
            try {
                synchronized (co) {
                    System.out.println(name + " is runing.");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(name + " is done.");
//                    co.wait();
                }
//                System.out.println(name + " has been notified.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}