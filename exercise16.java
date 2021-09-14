/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);
    

    System.out.println("What is your age?");
     int age = myObj.nextInt();
    
    if(age >= 16){
        System.out.println("You are old enough to legally drive.");
    } else {
         System.out.println("You are not old enough to legally drive.");
    }
 
     }
}