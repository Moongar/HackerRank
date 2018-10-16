package com.moses;

import java.util.ArrayList;

public class Java1DArray {
    public static void main(String[] args) {
        int leap=5;
        int[] game={0,1,1,1,0,0,1,1,0,0,1};
        System.out.println(canWin(leap,game));
    }
    public static boolean canWin(int leap, int[] game) {
        ArrayList<Integer> moves=new ArrayList<>();
        moves.add(0);
        int current;
        while(moves.size()>0){
            current=moves.get(0);
            if (current+leap>=game.length || current==game.length-1) return true;
            if(game[current+leap]==0){
                moves.add(current+leap);
                game[current+leap]=1;
            }
            if(game[current+1]==0){
                moves.add(current+1);
                game[current+1]=1;
            }
            if(current>0 && game[current-1]==0){
                moves.add(current-1);
                game[current-1]=1;
            }
            moves.remove(0);
        }
        return false;
    }
}
