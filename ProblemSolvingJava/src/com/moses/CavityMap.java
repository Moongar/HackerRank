package com.moses;

public class CavityMap {
    public static void main(String[] args) {
    String[] grid={"1112","1912","1892","1234"};
        System.out.println(cavityMap(grid)[1]);
    }
    static String[] cavityMap(String[] grid) {
        char up;
        char down;
        char left;
        char right;
        char center;
        String temp;
        for(int i=1;i<grid.length-1;i++){
            for(int j=1;j<grid[i].length()-1;j++){
                center=grid[i].charAt(j);
                up=grid[i-1].charAt(j);
                down=grid[i+1].charAt(j);
                right=grid[i].charAt(j+1);
                left=grid[i].charAt(j-1);
                if(center>left && center>right && center>up && center>down){
                    temp=grid[i];
                    grid[i]=temp.substring(0,i)+"X"+temp.substring(i+1,grid[i].length());
                }
            }
        }
        return grid;
    }
}
