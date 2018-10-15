package com.moses;

public class BigSum {
    public static void main(String[] args) {
       long[] ar = {2,5,7};
        System.out.println(aVeryBigSum(ar));
    }

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum =0;
        for (int i=0;i<ar.length;i++){
            sum+=ar[i];
        }
        return sum;
    }
}
