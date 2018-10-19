package com.moses;

import java.util.Arrays;

public class GridChallenge {
    public static void main(String[] args) {
        String[] grid={"ebacd","fghij","olmkn","trpqs","xywuv"};
        System.out.println(gridChallenge(grid));
    }
    static String gridChallenge(String[] grid) {
        int row=grid.length;
        int col=grid[0].length();
        char[][] chars=new char[row][col];
        for(int i=0;i<row;i++){
            chars[i]=Arrays.copyOf(grid[i].toCharArray(),col);
            Arrays.sort(chars[i]);
        }
        for(int i=0;i<row-1;i++){
            for(int j=0;j<col;j++){
                if(chars[i][j]>chars[i+1][j]) return "NO";
            }
        }
        return "YES";
    }
}
