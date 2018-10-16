package com.moses;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        for (int i=0;i<n;i++){
            int d = scanner.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for (int j=0;j<d;j++) {
                row.add(scanner.nextInt());
            }
            rows.add(row);
        }
        int q = scanner.nextInt();
        for(int i=0;i<q;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if (rows.get(x-1).size()>=y) System.out.println(rows.get(x-1).get(y-1));
            else System.out.println("ERROR!");
        }
    }
}
