package com.moses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        List<Integer> L= new ArrayList<>();
        for(int i=0;i<n;i++){
            L.add(scanner.nextInt());
        }
        int q=scanner.nextInt();
        for(int i=0; i<q;i++){
            scanner.nextLine();
            String query = scanner.nextLine();
            if(query.equals("Insert")){
                int x=scanner.nextInt();
                int y=scanner.nextInt();
                L.add(x,y);
            } else if(query.equals("Delete")){
                int x=scanner.nextInt();
                L.remove(x);
            }
        }
        for(int l:L) System.out.print(l+" ");
    }
}
