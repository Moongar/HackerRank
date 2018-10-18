package com.moses;

import java.util.HashMap;

public class SherlockAndAnagrams {
    public static void main(String[] args) {
        String s="ifailuhkqqhucpoltgtyovarjsnrbfpvmupwjjjfiwwhrlkpekxxnebfrwibylcvkfealgonjkzwlyfhhkefuvgndgdnbelgruel";
        //correct output=399
        System.out.println(sherlockAndAnagrams(s));
    }
    static int sherlockAndAnagrams(String s) {
        int count=0;
        for(int i=1;i<s.length();i++){
            for(int j=0;j<s.length()-i;j++){
                for(int k=j+1;k<s.length()-i+1;k++){
                    if (isAnagram(s.substring(j,j+i),s.substring(k,k+i))) count++;
                }
            }
        }
        return count;
    }

    private static boolean isAnagram(String s1, String s2) {
        HashMap<Character,Integer> S1=new HashMap<>();
        HashMap<Character,Integer> S2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(S1.containsKey(s1.charAt(i))){
                S1.replace(s1.charAt(i),S1.get(s1.charAt(i))+1);
            } else {
                S1.put(s1.charAt(i),1);
            }
            if(S2.containsKey(s2.charAt(i))){
                S2.replace(s2.charAt(i),S2.get(s2.charAt(i))+1);
            } else {
                S2.put(s2.charAt(i),1);
            }
        }
        if(S1.equals(S2)){
            return true;
        }
        return false;
    }
}
