package com.moses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            System.out.println(x/y);
        } catch (ArithmeticException e){
            System.out.println(e);
        } catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        }

//        try (Scanner scanner = new Scanner(System.in)){
//            System.out.println(scanner.nextInt()/scanner.nextInt());
//        } catch(InputMismatchException ex){
//            System.out.println(ex.getClass().getName());
//        } catch(ArithmeticException ae){
//            System.out.println(ae);
//        }
    }
}
