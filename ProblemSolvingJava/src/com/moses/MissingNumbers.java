package com.moses;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
    int[] a={1,3,5,7};
    int[] b={1,3,5,7,9,2,1,1};

    for(int i:missingNumbers(a,b)){
        System.out.print(i+" ");
    }
    }
    static int[] missingNumbers(int[] arr, int[] brr) {

        int min=minArray(brr);
        int max=maxArray(brr);
        int[] missing=new int[max-min+1];
        for(int i:brr){
            missing[i-min]++;
        }
        for(int i:arr){
            missing[i-min]--;
        }
        int count=0;
        for(int i:missing){
            if(i>0) count++;
        }
        int[] miss=new int[count];
        int counter=0;
        for(int i=0;i<missing.length;i++){
            if(missing[i]>0){
                miss[counter]=i+min;
                counter++;
            }
        }
        return miss;
    }
    static int minArray(int[] a){
        int min=a[0];
        for(int i:a){
            if(i<min) min=i;
        }
        return min;
    }
    static int maxArray(int[] a){
        int max=a[0];
        for(int i:a){
            if(i>max) max=i;
        }
        return max;
    }
}
