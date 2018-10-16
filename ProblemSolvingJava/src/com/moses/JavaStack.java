package com.moses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        Deque<Character> myStack=new ArrayDeque<>();
        while (sc.hasNext()) {
            String input=sc.next();
            if(input.length()==0) System.out.println("true");
            else{
                for(char c:input.toCharArray()){
                    if(myStack.isEmpty()){
                        myStack.push(c);
                    } else {
                        if((c==')' && myStack.peek()=='(') || (c=='}' && myStack.peek()=='{') || (c==']' && myStack.peek()=='[')){
                            myStack.pop();
                        } else {
                            myStack.push(c);
                        }
                    }
                }
                System.out.println(myStack.isEmpty());
                myStack.clear();
            }

        }

    }
}
