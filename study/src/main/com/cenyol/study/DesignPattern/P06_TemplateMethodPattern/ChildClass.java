package com.cenyol.study.DesignPattern.P06_TemplateMethodPattern;

/**
 * Created by cenyol on 15/04/2017.
 */
public class ChildClass extends AbstractClass{
    void func1() {
        System.out.println("这是算法中的第一步，由子类必须实现。");
    }

    void func3() {
        System.out.println("这是算法中的第三步，由子类必须实现。");
    }

    // 勉强实现一下钩子
    void hook(){
        System.out.println("实现了钩子函数：可以在算法模板中的某个步骤做一些手脚。");
    }
}
