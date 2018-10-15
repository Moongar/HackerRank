package com.moses;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,7,8};
        for(int i:quickSort(arr)){
            System.out.print(i+" ");
        }
    }
    static int[] quickSort(int[] arr) {
        int pivot=arr[0];
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        int[] equal=new int[arr.length];
        int[] div= new int[arr.length];
        int leftCnt=0;
        int rightCnt=0;
        int eqCnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<pivot){
                left[leftCnt]=arr[i];
                leftCnt++;
            } else if(arr[i]>pivot){
                right[rightCnt]=arr[i];
                rightCnt++;
            } else {
                equal[eqCnt++]=arr[i];
            }
        }
        System.arraycopy(left,0,div,0,leftCnt);
        System.arraycopy(equal,0,div,leftCnt,eqCnt);
        System.arraycopy(right,0,div,leftCnt+eqCnt,rightCnt);
        return div;
    }
}
