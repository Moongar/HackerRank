package com.moses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckBalance {
    public static void main(String[] args) {
        int k=1;
        int[][] contests={{5,1},{1,1},{4,0}};
        System.out.println(luckBalance(k,contests));
    }
    static int luckBalance(int k, int[][] contests) {
        int luck=0;
        List<Integer> importants=new ArrayList<Integer>();
        for(int i=0;i<contests.length;i++){
            if(contests[i][1]==0){
                luck+=contests[i][0];
            } else {
                importants.add(contests[i][0]);
            }
        }
        int[] array = importants.stream().mapToInt(i->i).toArray();
        Arrays.sort(array);
        int win=array.length-k;
        for(int i:array){
            if(win>0){
                luck-=i;
                win--;
            } else {
                luck+=i;
            }
        }
        return luck;
    }
}
