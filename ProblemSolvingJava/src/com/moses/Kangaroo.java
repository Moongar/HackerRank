package com.moses;

public class Kangaroo {
    public static void main(String[] args) {
        System.out.println(kangaroo(0 ,5, 3, 3));
    }
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1>v2){
            if (x1>x2) return "NO";
            while(x1<x2){
                x1+=v1;
                x2+=v2;
                if (x1==x2) return "YES";
            }
        } else {
            if (x2>x1) return "NO";
            while(x2<x1){
                x1+=v1;
                x2+=v2;
                if (x1==x2) return "YES";
            }
        }
        return "NO";
    }
}
