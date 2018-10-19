package com.moses;

import java.util.Arrays;

public class MaximumPerimeterTriangle {
    public static void main(String[] args) {
    int[] sticks={3,2,6,4,7};
    for(int i:maximumPerimeterTriangle(sticks)) System.out.print(i+" ");
    }
    static int[] maximumPerimeterTriangle(int[] sticks) {
        Arrays.sort(sticks);
        for(int i=sticks.length-1;i>1;i--){
            if(sticks[i]<sticks[i-1]+sticks[i-2]){
                return new int[]{sticks[i-2],sticks[i-1],sticks[i]};
            }
        }
        return new int[]{-1};
    }
}
