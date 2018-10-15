package com.moses;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        a.add(3);
        a.add(2);
        a.add(1);
        b.add(1);
        b.add(2);
        b.add(3);
        System.out.println(compareTriplets(a,b));
    }

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> scores= new ArrayList<Integer>();
        scores.add(0);
        scores.add(0);
        for(int i=0; i<3; i++){
            if(a.get(i)>b.get(i)){
                scores.set(0,scores.get(0)+1);
            } else if (a.get(i)<b.get(i)){
                scores.set(1,scores.get(1)+1);
            }
        }
        return scores;
    }
}
