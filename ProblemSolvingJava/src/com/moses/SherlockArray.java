package com.moses;

import java.util.ArrayList;
import java.util.List;

public class SherlockArray {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        System.out.println(balancedSums(arr));
    }
    static String balancedSums(List<Integer> arr) {
        if(arr.size()==1) return "YES";
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum-arr.get(0)==0) return "YES";
        int leftSum=0;
        for(int i=1;i<arr.size();i++){
            leftSum+=arr.get(i-1);
            if(2*leftSum==sum-arr.get(i)) return "YES";
        }
        return "NO";
    }
}
