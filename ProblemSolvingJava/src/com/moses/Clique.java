package com.moses;

public class Clique {
    public static void main(String[] args) {
        System.out.println(clique(4,6));
    }
    static int clique(int n, int m) {
        if(m==0) return 0;
        if(m==1) return 2;
        int end=n-1;
        int begin=1;
        int i=n/2;
        while(end-begin>1){
            if(maxEdge(n,i)>m){
                end=i;
            } else if(maxEdge(n,i)==m) return i;
            else{
                if(maxEdge(n,i+1)>=m) return i+1;
                else begin=i;
            }
            i=(begin+end)/2;
        }
        return i;

        //regular search (slow)
//        for(int i=n-1;i>0;i--){
//            ceil=(int) Math.ceil((double) n/i);
//            floor=n/i;
//            if((n*n-(n%i)*ceil*ceil-(i-(n%i))*floor*floor)/2<m) return i+1;
//        }
//        return 0;
    }
    static int maxEdge(int n, int i){
        int ceil=(int) Math.ceil((double) n/i);
        int floor=n/i;
        return (n*n-(n%i)*ceil*ceil-(i-(n%i))*floor*floor)/2;
    }
}
