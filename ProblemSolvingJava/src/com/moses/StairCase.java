package com.moses;

public class StairCase {
    public static void main(String[] args) {
        staircase(4);
    }
    // Complete the staircase function below.
    static void staircase(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j<=i){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
