package com.cenyol.study.DesignPattern.P06_TemplateMethodPattern;

/**
 * Created by cenyol on 15/04/2017.
 */
public abstract class AbstractClass {

    // 定义好的模板算法，并且子类无法修改该算法的内容
    final void templateMethod(){
        func1();
        func2();
        hook();
        func3();
    }

    abstract void func1();

    final void func2(){
        System.out.println("这是算法中的第二步，由超类实现，并且实用final关键字来修饰，子类不可以再修改。");
    }

    abstract void func3();

    // 钩子方法，子类看心情实现
    void hook(){}

}
