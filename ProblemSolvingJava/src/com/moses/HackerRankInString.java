package com.moses;

public class HackerRankInString {
    public static void main(String[] args) {
        System.out.println(hackerrankInString("hhhaaabbccckkkeeerraaaank"));
    }
    static String hackerrankInString(String s) {
        int index=0;
        char[] hacker="hackerrank".toCharArray();
        for(char c:s.toCharArray()){
            if(c==hacker[index]){
                index++;
                if (index==10) return "YES";
            }
        }
        return "NO";
    }
}
