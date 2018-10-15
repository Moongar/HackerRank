package com.moses;

public class SherlockSquares {
    public static void main(String[] args) {
        System.out.println(squares(1,17));
    }
    static int squares(int a, int b) {
        int count=0;
        int end= (int) (Math.sqrt(b));
        int start= (int) (Math.sqrt(a));
        count=end-start;
        if (start*start==a) count++;
        return count;
    }
}
