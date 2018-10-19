package com.moses;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BigSorting {
    public static void main(String[] args) {
        String[] unsorted={"123","34545459989665","455656565565665"};
        for(String s:bigSorting(unsorted)){
            System.out.println(s);
        }
    }
    static String[] bigSorting(String[] unsorted) {
        BigInteger[] numbers=new BigInteger[unsorted.length];
        for (int i=0;i<unsorted.length;i++){
            numbers[i]=new BigInteger(unsorted[i]);
        }
        Arrays.sort(numbers);
        for(int i=0;i<unsorted.length;i++){
            unsorted[i]=numbers[i].toString();
        }
        return unsorted;
    }
}
