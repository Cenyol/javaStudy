package com.cenyol.study.models;

/**
 * Created by cenyol on 18/03/2017.
 */
public class ReentrantChildClass extends ReentrantSuperClass {
    public synchronized void b(){
        System.out.println("---child class：begin.....childMethod");
        super.a();
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("---child class：end.....childMethod");
    }


    public static void main(String[] args) {
        ReentrantChildClass childClass = new ReentrantChildClass();
//        new ThreadForReentrantParentClass(childClass).start();
        new ThreadForReentrantChildClass(childClass).start();
    }
}

class ThreadForReentrantChildClass extends Thread{
    private ReentrantChildClass child = null;

    public ThreadForReentrantChildClass(ReentrantChildClass child)
    {
        this.child = child;
    }

    @Override
    public void run()
    {
        child.b();
    }
}

class ThreadForReentrantParentClass extends Thread{
    private ReentrantSuperClass superClass = null;

    public ThreadForReentrantParentClass(ReentrantSuperClass superClass)
    {
        this.superClass = superClass;
    }

    @Override
    public void run()
    {
        superClass.a();
    }
}