package com.moses;

public class Surface3D {
    public static void main(String[] args) {
        int[][] A={{1,3,4},{2,2,3},{1,2,4}};
        System.out.println(surfaceArea(A));
    }
    static int surfaceArea(int[][] A) {
        int rows=A.length;
        int cols=A[0].length;
        int s=0;
        int sides=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                s+=4*A[i][j]+2;
                //top
                if (i>0) sides+=(A[i][j]<=A[i-1][j])?A[i][j]:A[i-1][j];
                //bottom
                if (i<rows-1) sides+=(A[i][j]<=A[i+1][j])?A[i][j]:A[i+1][j];
                //left
                if (j>0) sides+=(A[i][j]<=A[i][j-1])?A[i][j]:A[i][j-1];
                //right
                if (j<cols-1) sides+=(A[i][j]<=A[i][j+1])?A[i][j]:A[i][j+1];

            }
        }
        return s-sides;
    }
}
