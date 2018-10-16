package com.moses;

public class DuplicateWords {
    public static void main(String[] args) {
        System.out.println(removeDuplicateWord("I am Am AM aM amoo moongar."));
    }
    //my alternative solution
    static String removeDuplicateWord(String s){
        String[] sArray=s.split(" ");
        String result=sArray[0];
        for(int i=1;i<sArray.length;i++){
            if(!sArray[i].equalsIgnoreCase(sArray[i-1])){
                result+=" "+sArray[i];
            }
        }
        return result;
    }
}
