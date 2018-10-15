package com.moses;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class JimOrder {
    public static void main(String[] args) {
        int[][] orders={{1,3},{2,3},{3,3}};
        for(int i:jimOrders(orders)){
            System.out.println(i);
        }
    }
    static int[] jimOrders(int[][] orders) {
        int[] servedFirst= new int[orders.length];
        int[] serveTime = new int[orders.length];
        for(int i=0;i<orders.length;i++){
            serveTime[i]=orders[i][0]+orders[i][1];
        }
        Arrays.sort(serveTime);

        return servedFirst;
    }
}
