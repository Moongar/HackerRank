package com.moses;

public class TimeToWord {
    public static void main(String[] args) {
        System.out.println(timeInWords(3,1));
    }
    static String timeInWords(int h, int m) {
        String[] numNames = {
                "",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifteen",
                "sixteen",
                "seventeen",
                "eighteen",
                "nineteen",
                "twenty"
        };
        if(m==0){
            return numNames[h]+ " o' clock";
        } else if(m>0 && m<=30){
            if (m==1) return "one minute past "+numNames[h];
            else if (m==15) return "quarter past "+numNames[h];
            else if(m==30) return "half past "+numNames[h];
            else if(m<=20) return numNames[m] +" minutes past "+numNames[h];
            else return numNames[20]+" "+numNames[m-20]+" minutes past "+numNames[h];
        } else {
            if (m==59) return "one minute to "+numNames[h+1];
            else if(m==45) return "quarter to "+numNames[h+1];
            else if(m>=40) return numNames[60-m] +" minutes to "+numNames[h+1];
            else return numNames[20]+" "+numNames[40-m]+" minutes to "+numNames[h+1];
        }
    }
}


