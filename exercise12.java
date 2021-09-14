/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);
    
    System.out.println("Enter the principal:");
     Double num = myObj.nextDouble();
    
    System.out.println("Enter the rate of interest:");
     double num2 = myObj.nextDouble();
     
    System.out.println("Enter the number of years");
        double num3 = myObj.nextDouble();
        
    
    double conversion = num2 / 100;   
    double a = num * (1 + (conversion*num3));
     
      System.out.println("After " + num3 + " years at " + num2 + ", " + " the investment will be worth $" + a);
  
     
     }
}