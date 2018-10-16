package com.moses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Deque<Character> myStack=new ArrayDeque<>();
            String input=sc.next();
            if(input.length()==0) System.out.println("true");
            else{
                myStack.push(input.charAt(0));
                for(int i=1;i<input.length();i++){
                    char c=input.charAt(i);
                    if((c==')' && myStack.peek()=='(') || (c=='}' && myStack.peek()=='{') || (c==']' && myStack.peek()=='[')){
                        myStack.pop();
                    } else {
                        myStack.push(c);
                    }
                }
                if(myStack.size()==0) System.out.println("true");
                else System.out.println("false");
            }

        }

    }
}
