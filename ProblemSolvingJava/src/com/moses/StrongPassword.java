package com.moses;

public class StrongPassword {
    public static void main(String[] args) {
//        System.out.println(minimumNumber(4,"Pa1+"));
        System.out.println(' '-97);
    }
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int min=0;
        int[] cases={1,1,1,1};
        for(char c:password.toCharArray()){
            if(cases[0]==1){
                if(c>='0' && c<='9'){
                    cases[0]=0;
                }
            }
            if(cases[1]==1){
                if(c>='a' && c<='z'){
                    cases[1]=0;
                }
            }
            if(cases[2]==1){
                if(c>='A' && c<='Z'){
                    cases[2]=0;
                }
            }
            if(cases[3]==1){
                if(c=='!' || c=='@' || c=='#' || c=='$' || c=='%' || c=='^' || c=='&' || c=='*' || c=='(' || c==')' || c=='-' || c=='+'){
                    cases[3]=0;
                }
            }
        }
        min=cases[0]+cases[1]+cases[2]+cases[3];
        if(min+n<6) min=6-n;
        return min;
    }
}
