package com.moses;

public class AppendDelete {
    public static void main(String[] args) {
        System.out.println(appendAndDelete("moosa","moses",10));
    }
    static String appendAndDelete(String s, String t, int k) {
        int i=0;
        int match=0;
        while(i<s.length() && i<t.length() && s.charAt(i)==t.charAt(i)){
            match++;
            i++;
        }
        int minMoves=s.length()-match+t.length()-match;
        if (k<minMoves) return "No";
        else if(k==minMoves) return "Yes";
        else{
            if((k-minMoves)%2==0) return "Yes";
            else {
                if (k-minMoves>=2*match) return "Yes";
                else return "No";
            }
        }
    }
}
