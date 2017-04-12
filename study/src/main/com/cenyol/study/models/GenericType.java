package com.cenyol.study.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cenyol on 15/03/2017.
 */
public class GenericType {
    public static int a(List<Integer> b, int c){return 0;}
    public static String a(List<String> s){return "";}


    public static void main(String[] args){
        a(new ArrayList<Integer>(), 4);
        a(new ArrayList<String>());
    }
}
