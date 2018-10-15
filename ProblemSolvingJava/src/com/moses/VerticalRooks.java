package com.moses;

public class VerticalRooks {
    public static void main(String[] args) {
        int[] r1={3,3,3,3};
        int[] r2={4,4,4,4};
        System.out.println(verticalRooks(r1,r2));
    }
    static String verticalRooks(int[] r1, int[] r2) {
        int nonBlocked=0;
        int n=r1.length;
        for (int i=0;i<n;i++){
            if (Math.abs(r1[i]-r2[i])>1) nonBlocked++;
        }
        if ((nonBlocked%2)==1) return "player-2";
        return "player-1";
    }
}
