package com.moses;

public class LarrysArray {
    public static void main(String[] args) {
        int[] A={6,5,1,2,4,3};
        System.out.println(larrysArray(A));
    }
    static String larrysArray(int[] A) {
        int n=A.length;
        int loc;
        int temp;
        for(int i=1;i<n-1;i++){
            loc=findInt(i,A);
            if(loc==n-1){
                temp=A[loc-2];
                A[loc-2]=A[loc-1];
                A[loc-1]=A[loc];
                A[loc]=temp;
                loc--;
            }
            for(int k=0;k<loc-i+1;k++){
                temp=A[loc-k-1];
                A[loc-k-1]=A[loc-k];
                A[loc-k]=A[loc-k+1];
                A[loc-k+1]=temp;
            }
        }
        if (A[n-2]==n-1) return "YES";
        return "NO";
    }

    private static int findInt(int i,int[] A) {
        for(int j=0;j<A.length;j++){
            if(A[j]==i) return j;
        }
        return -1;
    }
}
