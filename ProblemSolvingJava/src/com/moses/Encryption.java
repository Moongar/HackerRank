package com.moses;

public class Encryption {
    public static void main(String[] args) {
        System.out.println(encryption("chillout"));
    }
    static String encryption(String s) {
        s=s.replaceAll(" ","");
        StringBuilder stringBuilder = new StringBuilder();
        int n=s.length();
        int col=(int) Math.ceil(Math.sqrt(n));
        int row=(int) Math.floor(Math.sqrt(n));
        if(col*row<n) row+=1;
        int r;
        for(int c=0;c<col;c++){
            r=0;
            while(r<row && r*col+c<n){
                stringBuilder.append(s.charAt(r*col+c));
                r++;
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
