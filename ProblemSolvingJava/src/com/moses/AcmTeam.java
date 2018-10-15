package com.moses;

public class AcmTeam {
    public static void main(String[] args) {
        String[] topic={"101","001","011","010","100"};
        System.out.println(acmTeam(topic)[0]+" "+acmTeam(topic)[1]);
    }
    static int[] acmTeam(String[] topic) {
        int[] result = {0,0};
        int maxTopics=0;
        int twoTopics;
        for (String s1:topic){
            for (String s2: topic){
                twoTopics=0;
                for(int i=0;i<s1.length();i++){
                    if (s1.charAt(i)=='1' || s2.charAt(i)=='1') twoTopics++;
                }
                if (twoTopics>maxTopics) maxTopics=twoTopics;
            }
        }
        result[0]=maxTopics;
        int combinations=0;
        for (String s1:topic){
            for (String s2: topic){
                if (!s1.equals(s2)){
                    twoTopics=0;
                    for(int i=0;i<s1.length();i++){
                        if (s1.charAt(i)=='1' || s2.charAt(i)=='1') twoTopics++;
                    }
                    if (twoTopics==maxTopics) combinations++;
                }
            }
        }
        result[1]=combinations/2;
        return result;
    }

}
