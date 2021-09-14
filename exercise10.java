/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);
    
    System.out.println("Enter the price of item 1:");
     int num = myObj.nextInt();
    
    System.out.println("Enter the quantity of item 1:");
     int num2 = myObj.nextInt();
     
      System.out.println("Enter the price of item 2:");
     int num3 = myObj.nextInt();
    
    System.out.println("Enter the quantity of item 2:");
     int num4 = myObj.nextInt();
     
      System.out.println("Enter the price of item 3:");
     int num5 = myObj.nextInt();
    
    System.out.println("Enter the quantity of item 3:");
     int num6 = myObj.nextInt();
     
     double subtotal = (num * num2) + (num3 * num4) + (num5 * num6);
     double tax = subtotal * .055;
     double total = subtotal + tax;
     
      System.out.println("Subtotal: " + subtotal);
      System.out.println("Tax: " + tax);
      System.out.println("Total " + total);
     
     }
}