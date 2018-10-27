package com.moses;

public class CaesarCipher {
    public static void main(String[] args) {
        String s="middle-Outz";
        s= caesarCipher(s,2);
        System.out.println(s);
    }
    static String caesarCipher(String s, int k) {
        k=k%26;
        char[] chars=s.toCharArray();
        int asc;
        for(int i=0; i<s.length();i++){
            if(chars[i]>='a' && chars[i]<='z'){
                asc=chars[i]+k;
                if(asc>122) asc-=26;
                chars[i]= (char) (asc);

            } else if(chars[i]>='A' && chars[i]<='Z'){
                asc=chars[i]+k;
                if(asc>90) asc-=26;
                chars[i]= (char) (asc);
            }
        }
        return String.valueOf(chars);
    }
}
