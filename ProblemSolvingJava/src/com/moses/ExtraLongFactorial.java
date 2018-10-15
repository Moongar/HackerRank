package com.moses;

import java.math.BigInteger;

public class ExtraLongFactorial {
    public static void main(String[] args) {
        extraLongFactorials(3);
    }
    static void extraLongFactorials(int n) {
        BigInteger fac = BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
            fac=fac.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fac);
    }

}
