package com.moses;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        boolean found;
        while(testCases>0){
            String line = in.nextLine();
            found = false;
            String tagPattern= "<(.+)>([^<]+)</\\1>";
            Pattern pattern=Pattern.compile(tagPattern);
            Matcher matcher=pattern.matcher(line);
            while(matcher.find()){
                System.out.println(matcher.group(2));
                found=true;
            }
            testCases--;
            if(!found) System.out.println("None");
        }
    }
}
