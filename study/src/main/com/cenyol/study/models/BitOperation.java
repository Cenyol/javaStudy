package com.cenyol.study.models;

/**
 * Created by cenyol on 02/03/2017.
 */
public class BitOperation {
    public int calculateCountOf1(int n){
        int count = 0, flag = 1;
        while (flag > 0){
            if ((n & flag) > 0){
                count++;
            }
            flag <<= 1;
        }
        return count;
    }

    public int calculateCountOf11(int n){
        int count = 0;
        while (n > 0) {
            count++;
            n &= n-1;
        }
        return count;
    }
}
