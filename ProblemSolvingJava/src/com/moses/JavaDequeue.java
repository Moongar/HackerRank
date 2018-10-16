package com.moses;

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> intSet= new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max=1;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            intSet.add(num);
            if (deque.size() == m) {
                if (intSet.size() > max) max = intSet.size();
                int first = deque.removeFirst();
                if (!deque.contains(first)) intSet.remove(first);
            }
        }
        System.out.println(max);
    }
}
