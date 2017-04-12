package com.cenyol.study.designPartner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 里氏替换原则2
 * 子类重载父类中的方法
 *
 * Created by cenyol on 06/04/2017.
 */
public class LSRegular2{

    public static void main(String[] args){
        Child p = new Child();
        p.doSth(new HashMap());
        p.doSth((Map) new HashMap());
    }
}

class Father {
    public Collection doSth(Map map){
        System.out.println("执行父类......");
        return map.values();
    }
}


class Child extends Father{
    public Collection doSth(HashMap map){
        System.out.println("执行子类......");
        return map.values();
    }
}