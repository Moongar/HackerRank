package com.moses;

public class DesignerPDF {
    public static void main(String[] args) {
        int[] h={1,2,3};
        System.out.println(designerPdfViewer(h,"abccc"));
    }
    static int designerPdfViewer(int[] h, String word) {
        int maxH=0;
        for(int i=0; i<word.length();i++){
            if (h[word.charAt(i)-97]>maxH) maxH=h[word.charAt(i)-97];
        }
        return maxH*word.length();
    }
}
