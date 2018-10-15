package com.moses;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:05:45AM"));
    }
    static String timeConversion(String s) {
        char c = s.charAt(8);
        if (c=='A'){
            if (s.charAt(0)=='1' && s.charAt(1)=='2') return "00"+s.substring(2,s.length()-2);
            return s.substring(0,s.length()-2);
        } else {
            int d1=(int) s.charAt(0)-48;
            int d2=(int) s.charAt(1)-48;
            if (d1==1 && d2==2) return s.substring(0,s.length()-2);
            return (12+d1*10+d2)+s.substring(2,s.length()-2);
        }
    }
}
