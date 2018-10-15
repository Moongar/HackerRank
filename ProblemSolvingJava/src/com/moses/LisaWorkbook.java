package com.moses;

public class LisaWorkbook {
    public static void main(String[] args) {
        int[] arr={4,2,6,1,10};
        System.out.println(workbook(5,3,arr));
    }
    static int workbook(int n, int k, int[] arr) {
        int special=0;
        int startPage=0;
        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=arr[i-1];j++){
                if (j==startPage+Math.ceil((double) j/k)){
                    special++;
                    System.out.println("chapter "+i+",problem "+j);
                }
            }
            startPage+=Math.ceil((double) arr[i-1]/k);
        }
        return special;
    }
}
