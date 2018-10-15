package com.moses;

public class Valleys {
    public static void main(String[] args) {
        String s="UDDUUDDUUUDDDU";
        System.out.println(countingValleys(10, s));
    }
    static int countingValleys(int n, String s) {
        int vals =0;
        int level=0;
        boolean underSea=false;
        char[] chars=s.toCharArray();
        for (char c:chars){
            if (c=='D') level--;
            else level++;
            if (underSea==true && level==0) vals++;
            if (level<0) underSea=true;
            else underSea=false;
        }
        return vals;
    }
}
