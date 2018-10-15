package com.moses;

import java.util.ArrayList;
import java.util.List;

public class ChocolateBar {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<Integer>(5);
        s.add(2);
        s.add(2);
        s.add(3);
        s.add(1);
        s.add(3);
        System.out.println(birthday(s, 4,2));
    }
    static int birthday(List<Integer> s, int d, int m) {
        int ways=0;
        int sum;
        for(int i=0;i<s.size()-m+1;i++) {
            sum=0;
            for (int j=0;j<m;j++){
                sum+=s.get(i+j);
            }
            if (sum==d) ways++;
        }
        return ways;
    }
}
