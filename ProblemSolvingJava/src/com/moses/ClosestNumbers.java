package com.moses;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {
    public static void main(String[] args) {
       int[] arr={5,4,3,2};
        closestNumbers(arr);
    }
    static int[] closestNumbers(int[] arr) {
        List<Integer> pairs=new ArrayList<>();
        Arrays.sort(arr);
        int min=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]<min) min=arr[i+1]-arr[i];
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min){
                pairs.add(arr[i]);
                pairs.add(arr[i+1]);
                System.out.print(arr[i]+" "+arr[i+1]+" ");
            }
        }
        return pairs.stream().mapToInt(i -> i).toArray();
    }
}
