package com.moses;

public class PlusMinus {
    public static void main(String[] args) {
        int[] arr ={3,5,-1,0};
        plusMinus(arr);
    }
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        int n = arr.length;
        for (int i:arr){
            if (i<0){
                neg++;
            } else if (i>0){
                pos++;
            } else {
                zero++;
            }
        }
        System.out.println(String.format("%.6f", (double) pos/n));
        System.out.println(String.format("%.6f", (double) neg/n));
        System.out.println(String.format("%.6f", (double) zero/n));
    }
}
