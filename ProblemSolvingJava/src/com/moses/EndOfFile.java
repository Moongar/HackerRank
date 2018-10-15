package com.moses;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =0;
        while (scanner.hasNext()){
            count++;
            System.out.println(count+" "+scanner.nextLine());
        }
        scanner.close();
    }
}
