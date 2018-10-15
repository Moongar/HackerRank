package com.moses;

public class Kaprekar {
    public static void main(String[] args) {
        kaprekarNumbers(100000,100000);
    }
    static void kaprekarNumbers(int p, int q) {
        boolean notFound=true;
        long squared;
        int digits;
        long l;
        long r;
        int temp;
        for (int i=p; i<=q;i++){
            squared=(long) i*i;
            System.out.println(squared);
            digits=numDigits(squared);
            r=0;
            r= squared%(int)(Math.pow(10,Math.ceil((double) digits/2)));
            squared/=(long)(Math.pow(10,Math.ceil((double) digits/2)));
            l= squared;
            System.out.println(r);
            System.out.println(l);
            if(r+l==i){
                notFound=false;
                System.out.println(i);
            }
        }
        if (notFound) System.out.println("INVALID RANGE");
    }

    private static int numDigits(long num) {
        int digits=0;
        while(num>0){
            digits++;
            num/=10;
        }
        return digits;
    }
}
