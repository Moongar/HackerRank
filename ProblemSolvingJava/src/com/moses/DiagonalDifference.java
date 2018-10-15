package com.moses;

public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] arr ={{1,2,8},{3,5,13},{7,1,9}};
        System.out.println(diagonalDifference(arr));
    }

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int sum1=0;//main diagonal sum
        int sum2=0;//other diagonal sum
        int n=arr.length;
        for (int i=0;i<n;i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        return Math.abs(sum1-sum2);
    }
}
