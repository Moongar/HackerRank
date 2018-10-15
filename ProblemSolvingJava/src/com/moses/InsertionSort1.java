package com.moses;

public class InsertionSort1 {
    public static void main(String[] args) {
        int[] arr={2, 4, 6, 8, 1};
        insertionSort1(5,arr);
    }
    static void insertionSort1(int n, int[] arr) {
        int idx=arr.length-1;
        int temp=arr[idx];
        boolean sorted=false;
        if(idx==0 || temp>=arr[idx-1]){
            sorted=true;
        }
        while(!sorted && idx>0){
            arr[idx]=arr[idx-1];
            idx--;
            printArray(arr);
            if(idx==0 || temp>=arr[idx-1]) {
                sorted = true;
                arr[idx] = temp;
            }
        }
        printArray(arr);
    }
    private static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
