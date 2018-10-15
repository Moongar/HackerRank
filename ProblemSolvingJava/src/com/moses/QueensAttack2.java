package com.moses;

public class QueensAttack2 {
    public static void main(String[] args) {
        //int[][] obs={{5,5},{4,2},{2,3}};
        int[][] obs={{}};
        System.out.println(queensAttack(4,0,4,4,obs));

    }
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int hit=-1;
        r_q--;
        c_q--;
        boolean block;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(canAttack(r_q,c_q,i,j)){
                    block=false;
                    for(int m=0;m<k;m++){
                        block=inMiddle(r_q,c_q,i,j,obstacles[m]);
                        if(block) break;
                    }
                    if(!block){
                        hit++;
                        //System.out.println(i+" "+j);
                    }
                }
            }
        }
        return hit;
    }
    private static boolean canAttack(int r,int c,int i,int j){
        return(r==i || c==j || (c-j)==(r-i) || (c-j)==(i-r));
    }
    private static boolean inMiddle(int x1,int y1,int x2, int y2, int[] obs){
        int x3=obs[0]-1;
        int y3=obs[1]-1;
        //2=3?
        if(x2==x3 && y2==y3) return true;
        //vertical lines
        if(x1==x2){
            if(x1==x3){
                if((y1>y3 && y3>=y2)||(y1<y3 && y3<=y2)){
                    return true;
                } else {
                    return false;
                }
            }
        }
        //horizontal lines
        if(y1==y2){
            if(y1==y3){
                if((x1>x3 && x3>=x2)||(x1<x3 && x3<=x2)){
                    return true;
                } else {
                    return false;
                }
            }
        }
        //other lines
        if(canAttack(x1,y1,x3,y3)){
            if(((y3-y1)*(x2-x1))==((x3-x1)*(y2-y1))){
                if((x1<x3 && x3<=x2)||(x1>x3 && x3>=x2)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}