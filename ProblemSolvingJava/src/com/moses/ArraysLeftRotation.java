package com.moses;

public class ArraysLeftRotation {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        for(int i:rotLeft(a,2)){
            System.out.print(i+" ");
        }
    }
    static int[] rotLeft(int[] a, int d) {
        d=d%a.length;
        int[] b=new int[a.length];
        System.arraycopy(a, d, b, 0, a.length - d);
        System.arraycopy(a, 0, b, a.length - d, d);
        return b;
    }
}
