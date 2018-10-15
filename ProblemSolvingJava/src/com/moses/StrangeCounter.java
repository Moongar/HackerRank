package com.moses;

public class StrangeCounter {
    public static void main(String[] args) {
        System.out.println(strangeCounter(11l));
    }
    static long strangeCounter(long t) {
        int stage=1;
        while((3*(Math.pow(2,stage)-1))<t) stage++;
        return (long) Math.floor(3*(Math.pow(2,stage)-1))-t+1;
    }
}
