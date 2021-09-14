/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);
    
    System.out.println("What is the order amount?");
     Double num = myObj.nextDouble();
    
    System.out.println("What is the state?");
    String name = myObj.nextLine();
    
    
    if (name.equals("WI"))
    {
        double tax = 0.55;
        System.out.println("The tax is $" + tax);
        System.out.println("The total is $" + (num + tax));
    }
    
     System.out.println("The subtotal is $" + num);
 
     }
}