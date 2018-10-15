package com.moses;

import java.util.Scanner;

public class ElectronicShop {
    public static void main(String[] args) {
        int[] key = {4,2,8};
        int[] dri = {1,9,2};
        System.out.println(getMoneySpent(key,dri,15));
        System.out.printf("moosa"+"%10d",2);
    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxBuy=0;
        for (int i : keyboards){
            for (int j: drives){
                if ((i+j)>maxBuy && (i+j)<=b) maxBuy=i+j;
            }
        }
        return maxBuy;
    }
}
