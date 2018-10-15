package com.moses;

public class NonDivisibleSubset {
    public static void main(String[] args) {
        int[] S ={1,7,3,4,3};
        int k=4;
        System.out.println(nonDivisibleSubset(k,S));
    }
    static int nonDivisibleSubset(int k, int[] S) {
        int max=0;
        int[] reps = new int[k];
        for(int i: S){
            reps[i%k]++;
        }
        int end;
        if ((k%2)==1) end=k/2;
        else end=k/2-1;
        for(int i=1;i<=end;i++){
            if(reps[i]>=reps[k-i]){
                max+=reps[i];
            } else {
                max+=reps[k-i];
            }
        }
        if(reps[0]>0) max++;
        if ((k%2)==0){
            if (reps[k/2]>0) max++;
        }
        return max;
    }
}
