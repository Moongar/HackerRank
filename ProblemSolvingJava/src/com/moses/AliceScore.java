package com.moses;

import java.util.ArrayList;
import java.util.List;

public class AliceScore {
    public static void main(String[] args) {
    int[] alice = {5,25,50,100,120};
    int[] scores= {100, 100, 50, 40, 40, 20, 10};
    int[] result = climbingLeaderboard(scores,alice);
    for (int i:result) System.out.print(i+" ");
    }
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] aliceRank =new int[alice.length];
        int rank=2;
        int current;
        int i=alice.length-1;
        current=scores[0];
        int j=1;
        while (i>=0){
            if (alice[i]>=scores[0]){
                aliceRank[i]=1;
            } else {
                while (j<scores.length && alice[i]<scores[j]){
                    if (scores[j]!=current){
                        rank++;
                        current=scores[j];
                    }
                    j++;
                }
                aliceRank[i]=rank;
            }
            i--;
        }
        return aliceRank;
    }
}
