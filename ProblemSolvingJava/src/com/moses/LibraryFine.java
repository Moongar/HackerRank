package com.moses;

public class LibraryFine {
    public static void main(String[] args) {
        System.out.println(libraryFine(1,5,2001,1,1,2010));
    }
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1<y2){
            return 0;
        } else if(y1==y2){
            if (m1<m2){
                return 0;
            } else if (m1==m2){
                if (d1<=d2){
                    return 0;
                } else {
                    return 15*(d1-d2);
                }
            }else {
                return 500*(m1-m2);
            }
        } else {
            return 10000;
        }
    }
}
