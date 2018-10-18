package com.moses;

import java.util.HashMap;

public class HappyLadybugs {
    public static void main(String[] args) {
        String b="A";
        System.out.println(happyLadybugs(b));
    }
    static String happyLadybugs(String b) {
        HashMap<Character, Integer> bugs=new HashMap<>();
        boolean happy=true;
        for(char c: b.toCharArray()){
            if(bugs.containsKey(c)){
                bugs.replace(c,bugs.get(c)+1);
            } else {
                bugs.put(c,1);
            }
        }
        if(!bugs.containsKey('_')){
            if (isHappy(b)) return "YES";
            return "NO";
        }
        for (char c:bugs.keySet()){
            if(c!='_'){
                if(bugs.get(c)==1) return "NO";
            }
        }
        return "YES";
    }

    private static boolean isHappy(String b) {
        if (b.length()<2)return false;
        int count=1;
        char current=b.charAt(0);
        for(int i=1;i<b.length();i++){
            if(b.charAt(i)==current) count++;
            else{
                if (count==1 || i==b.length()-1) return false;
                else current=b.charAt(i);
                count=1;
            }
        }
        return true;
    }
}
