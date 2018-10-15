package com.moses;

public class InsertionSort2 {
    public static void main(String[] args) {
        int[] arr={1, 4, 3, 5, 6, 2};
        insertionSort2(6,arr);
    }
    static void insertionSort2(int n, int[] arr) {
        int idx;
        int temp;
        boolean sorted;
        for (int i=2;i<=arr.length;i++){
            idx=i-1;
            temp=arr[idx];
            sorted=false;
            if(idx==0 || temp>=arr[idx-1]){
                sorted=true;
            }
            while(!sorted && idx>0){
                arr[idx]=arr[idx-1];
                idx--;
                if(idx==0 || temp>=arr[idx-1]) {
                    sorted = true;
                    arr[idx] = temp;
                }
            }
            printArray(arr);
        }
    }
    private static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
