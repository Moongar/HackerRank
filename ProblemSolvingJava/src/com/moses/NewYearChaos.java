package com.moses;

public class NewYearChaos {
    public static void main(String[] args) {
        int[] q={2, 5, 1, 3, 4};
        minimumBribes(q);
    }
    static void minimumBribes(int[] q) {
        int count=0;
        boolean chaotic=false;
        for(int i=q.length;i>0;i--){
            if (q[i-1]!=i){
                if (q[i-2]==i){
                    count++;
                    q[i-2]=q[i-1];
                    q[i-1]=i;
                } else if (q[i-3]==i){
                    count+=2;
                    q[i-3]=q[i-2];
                    q[i-2]=q[i-1];
                    q[i-1]=i;
                } else {
                    System.out.println("Too chaotic");
                    chaotic=true;
                    break;
                }
            }
        }
        if(!chaotic) System.out.println(count);
    }
}
