package com.cenyol.study.models;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by cenyol on 16/03/2017.
 */
public class MyThreadLocal {


    public static class MyRunnable implements Runnable {
        private User1 user1;

        public MyRunnable(User1 user1){
            this.user1 = user1;
        }

        private ThreadLocal<User1> threadLocal = new ThreadLocal<User1>();
        private ThreadLocal<Integer> threadLocal1 = new ThreadLocal<Integer>();

        public void run() {
            threadLocal.set( user1 );
            threadLocal1.set(5);

            System.out.println(threadLocal1.get() + ":" +threadLocal.get().getA());
        }
    }

    public static void main(String[] args) throws Exception{
        User1 user1 = new User1();
        for (int i = 0; i < 1; i++) {
            MyRunnable sharedRunnableInstance = new MyRunnable(user1);
            Thread thread = new Thread(sharedRunnableInstance);
            thread.start();
            user1.setA(i);
        }


        // another test
        final Map<Test<String>, Integer> map = new HashMap<Test<String>, Integer>();
        map.put(new Test<String>(), 2);
        map.put(new Test<String>(), 2);

        Map<Test<?>, Integer> map1 = new HashMap<Test<?>, Integer>();
        map1.put(new Test<String>(), 2);
        map1.put(new Test<Integer>(), 2);
    }
}
class Test<T>{
    private T q;

    public T getQ() {
        Executors.newFixedThreadPool(2);
        return q;
    }

    public void setQ(T q) {
        this.q = q;
    }
}


class User1{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

