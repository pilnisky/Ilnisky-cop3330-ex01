/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);
       
    
    System.out.println("What is the first number?");
    int num = myObj.nextInt();
    
    System.out.println("What is the second number?");
    int num2 = myObj.nextInt();
    
   
    System.out.println(num + num2);
    System.out.println(num - num2);
    System.out.println(num * num2);
    System.out.println(num / num2);
  
     }
}