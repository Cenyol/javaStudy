package com.cenyol.study.models;

/**
 * Created by cenyol on 08/03/2017.
 * 看看尾递归的效果
 */
public class TailRecume {

    public int inceaceByTailRecume(int n, int total){
        if (n == 0) return total;
        return inceaceByTailRecume( n - 1, n + total);
    }

    public static void main(String[] args){
        TailRecume tailRecume = new TailRecume();
        System.out.println(tailRecume.inceaceByTailRecume(99999, 0));
    }
}
