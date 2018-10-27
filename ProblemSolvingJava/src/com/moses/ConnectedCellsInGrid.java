package com.moses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectedCellsInGrid {
    public static void main(String[] args) {
        int[][] matrx={{1,1,0,0},{0,1,1,0},{0,0,1,0},{1,0,0,0}};
        System.out.println(connectedCell(matrx));
    }
    static int connectedCell(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int count;
        int maxArea=0;
        int[] current=new int[2];
        List<Integer> visited=new ArrayList<>();
        List<int[]> region=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if (!visited.contains(10 * i + j)){
                    visited.add(10*i+j);
                    if(matrix[i][j]==1){
                        count=1;
                        region.add(new int[] {i,j});
                        while(region.size()>0){
                            current=region.get(0);
                            region.remove(0);
                            if(current[0]>0 && current[1]>0)  count = checkNeighbor(matrix, count, visited, region, current[0]-1, current[1]-1);
                            if(current[0]>0)         count = checkNeighbor(matrix, count, visited, region, current[0]-1,   current[1]);
                            if(current[0]>0 && current[1]<n-1)count = checkNeighbor(matrix, count, visited, region, current[0]-1, current[1]+1);
                            if(current[1]>0)         count = checkNeighbor(matrix, count, visited, region,   current[0],   current[1]-1);
                            if(current[1]<n-1)       count = checkNeighbor(matrix, count, visited, region,   current[0],   current[1]+1);
                            if(current[0]<m-1 && current[1]>0)count = checkNeighbor(matrix, count, visited, region, current[0]+1, current[1]-1);
                            if(current[0]<m-1)       count = checkNeighbor(matrix, count, visited, region, current[0]+1,   current[1]);
                            if(current[0]<m-1 && current[1]<n-1)count=checkNeighbor(matrix, count, visited, region, current[0]+1, current[1]+1);
                        }
                        if(count>maxArea) maxArea=count;
                    }
                }
            }
        }
        return maxArea;
    }

    private static int checkNeighbor(int[][] matrix, int count, List<Integer> visited, List<int[]> region, int i, int j) {
        if (!visited.contains(10*i+j)){
            visited.add(10*i+j);
            if(matrix[i][j]==1){
                count++;
                region.add(new int[] {i,j});
            }
        }
        return count;
    }
}
