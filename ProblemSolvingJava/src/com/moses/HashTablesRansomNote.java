package com.moses;

import java.util.HashMap;

public class HashTablesRansomNote {
    public static void main(String[] args) {
        String[] magazine={"give", "me", "one", "grand", "today", "night"};
        String[] note={"give", "one", "grand", "today"};
        checkMagazine(magazine,note);
    }
    static void checkMagazine(String[] magazine, String[] note) {
        boolean possible=true;
        HashMap<String,Integer> magWords=new HashMap<>();
        HashMap<String,Integer> noteWords=new HashMap<>();
        for(String s:magazine){
            if(magWords.containsKey(s)) magWords.replace(s,magWords.get(s)+1);
            else magWords.put(s,1);
        }
        for(String s:note){
            if(noteWords.containsKey(s)) noteWords.replace(s,noteWords.get(s)+1);
            else noteWords.put(s,1);
        }
        for(String s:noteWords.keySet()){
            if(!magWords.containsKey(s)) {
                System.out.println("No");
                possible=false;
                break;
            }
            else if(magWords.get(s)<noteWords.get(s)) {
                System.out.println("No");
                possible=false;
                break;
            }
        }
        if(possible) System.out.println("Yes");
    }
}
