package com.moses;

public class FunnyString {
    public static void main(String[] args) {
        System.out.println(funnyString("bc"));

    }
    static String funnyString(String s) {
        int end=s.length()-1;
        if(end<3) return "Funny";
        for(int i=0;i<=s.length()/2;i++){
            if (Math.abs(s.charAt(i)-s.charAt(i+1))!=Math.abs(s.charAt(end-i)-s.charAt(end-i-1))){
                return "Not Funny";
            }
        }
        return "Funny";
    }
}
