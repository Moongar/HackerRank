package com.moses;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        BitSet b1=new BitSet(n);
        BitSet b2=new BitSet(n);
        for(int i=0;i<m;i++){
            scanner.nextLine();
            String operation=scanner.next();
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();
            if (operation.equals("AND")){
                if(num1==1) b1.and(b2);
                else b2.and(b1);
            } else if(operation.equals("OR")){
                if(num1==1) b1.or(b2);
                else b2.or(b1);
            } else if(operation.equals("XOR")){
                if(num1==1) b1.xor(b2);
                else b2.xor(b1);
            } else if (operation.equals("FLIP")){
                if(num1==1) b1.flip(num2);
                else b2.flip(num2);
            } else if (operation.equals("SET")){
                if(num1==1) b1.set(num2);
                else b2.set(num2);
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }
    }
}
