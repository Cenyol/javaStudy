package com.cenyol.study.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cenyol on 08/03/2017.
 */
public class PrintOneToNBit {
    private Map<Integer, Character> map = new HashMap<Integer, Character>();
    {
        for (int i = 0; i < 10; i++)
            map.put(i, (char)('0'+i));
    }

    public int  print(char[] cs, int pos, int n, boolean preAllZero){
        for (int i = 0; i < 10; i++) {
            if (n == 1) {
                cs[pos] = map.get(i);
                System.out.println(cs);
                continue;
            }
            if (preAllZero && i == 0)
                print(cs, pos,n - 1, preAllZero && i == 0);
            else {
                cs[pos] = map.get(i);
                print(cs, pos + 1,n - 1, preAllZero && i == 0);
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int n = 4;
        PrintOneToNBit printOneToNBit = new PrintOneToNBit();
        printOneToNBit.print(new char[n], 0, n, true);
    }
}
