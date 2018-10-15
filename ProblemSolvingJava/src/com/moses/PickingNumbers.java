package com.moses;

public class PickingNumbers {
    public static void main(String[] args) {
        int[] a ={4,5,6,3,3,3};
        System.out.println(pickingNumbers(a));
    }
    static int pickingNumbers(int[] a) {
        int[] nums = new int[100];
        for(int i: a){
            nums[i-1]++;
        }
        int maxInts=0;
        for(int i=0;i<99;i++){
            if((nums[i]+nums[i+1])>maxInts) maxInts=nums[i]+nums[i+1];
        }
        return maxInts;
    }
}
