package com.cenyol.study.models;

/**
 * Created by cenyol on 02/03/2017.
 */
public class FourEqualSection {

    /** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/

    public boolean resolve(int[] A) {
        if(A == null || A.length < 6) return false;

        int[] m = {1, 3, 5};
        int[] sum = {0, 0, 0, 0};
        int[] aSum = new int[A.length];                 // 空间O n

        aSum[0] = A[0];
        for (int i = 1; i < A.length; i++){
            aSum[i] = aSum[i-1] + A[i];
        }

        int maxSumLeftIndex;
        while(m[0] < m[1]-1 && m[1] < m[2] - 1 && m[2] < A.length - 1){
            sum[0] = aSum[m[0]-1];
            sum[1] = aSum[m[1]-1] - aSum[m[0]];
            sum[2] = aSum[m[2]-1] - aSum[m[1]];
            sum[3] = aSum[A.length-1] - aSum[m[2]];

            if (sum[0] == sum[1] && sum[1] == sum[2] && sum[2] == sum[3])
                return true;

            maxSumLeftIndex = maxSumLeftIndex(sum);
            m[maxSumLeftIndex]++;
        }

        return false;
    }
    private int maxSumLeftIndex(int[] sum){
        int pos = 0;
        for (int i = 1; i < sum.length; i++){
            if (sum[i] > sum[pos])
                pos = i;
        }
        return pos > 1 ? pos - 1 : 0;
    }
}
