package com.cenyol.study.models;

/**
 * Created by cenyol on 04/04/2017.
 */
public class NoVisibility {
    public static void main(String[] args) {
        SyncInteger syncInteger = new SyncInteger();
        for (int i = 0; i < 39; i++){
            new MyThread21(syncInteger, 2 * i).start();
            new MyThread22(syncInteger, 2 * i + 1).start();
        }
    }
}

class MyThread21 extends Thread{
    private SyncInteger syncInteger = null;
    private int a;

    public MyThread21(SyncInteger syncInteger, int a){
        this.syncInteger = syncInteger;
        this.a = a;
    }

    public void run(){
        syncInteger.setValue(a);
//        System.out.println(a + ":" + syncInteger.getValue());
    }
}
class MyThread22 extends Thread{
    private SyncInteger syncInteger = null;
    private int a;

    public MyThread22(SyncInteger syncInteger, int a){
        this.syncInteger = syncInteger;
        this.a = a;
    }

    public void run(){
        System.out.println(a - 1 + ":" + syncInteger.getValue());
    }
}

class SyncInteger{
    private int value;

    public int getValue(){
        return value;
    }

    public synchronized void setValue(int value){
        this.value = value;
    }
}