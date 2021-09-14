/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);
    
    System.out.println("How many euros are you exchanging?");
     Double num = myObj.nextDouble();
    
    System.out.println("What is the exchange rate?");
     double num2 = myObj.nextDouble();
     
     double rate = num * num2;
     
      System.out.println(num + " euros at an exchange rate of " + num2 + " is");
      System.out.println(rate + " U.S. dollars.");
     
     }
}