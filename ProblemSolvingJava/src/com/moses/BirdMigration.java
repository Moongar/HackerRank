package com.moses;

import java.util.ArrayList;
import java.util.List;

public class BirdMigration {
    public static void main(String[] args) {
    List<Integer> arr= new ArrayList<Integer>();
    arr.add(3);
    arr.add(2);
    arr.add(3);
    arr.add(2);
        System.out.println(migratoryBirds(arr));
    }
    static int migratoryBirds(List<Integer> arr) {
        int[] freq=new int[5];
        for (int i : arr){
            if (i==1) freq[0]++;
            else if (i==2) freq[1]++;
            else if (i==3) freq[2]++;
            else if (i==4) freq[3]++;
            else freq[4]++;
        }
        int max=freq[0];
        int maxIndex=1;
        for (int i=1; i<5; i++){
            if (freq[i]>max){
                max=freq[i];
                maxIndex++;
            }
        }
        return maxIndex;
    }
}
