package com.moses;

import java.util.ArrayList;
import java.util.List;

public class CutSticks {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,4,5};
        int[] nums = cutTheSticks(arr);
        for(int i:nums){
            System.out.println(i);
        }
    }
    static int[] cutTheSticks(int[] arr) {
        List<Integer> nums= new ArrayList<Integer>();
//        int[] nums=new int[10];
        int zeroCount=0;
        int minIndex;
        int minValue;
        int round=0;
        while(zeroCount<arr.length){
            nums.add(arr.length-zeroCount);
//            nums[round++]=arr.length-zeroCount;
            minIndex = minFinder(arr);
            minValue=arr[minIndex];
            for (int i=0;i<arr.length;i++){
                if (arr[i]!=0){
                    arr[i]-=minValue;
                    if (arr[i]==0) zeroCount++;
                }
            }
        }
        return nums.stream().mapToInt(i -> i).toArray();
    }
    private static int minFinder(int[] arr) {
        int idx=0;
        int minValue = 10000;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0 && arr[i]<minValue){
                idx=i;
                minValue=arr[i];
            }
        }
        return idx;
    }

}
