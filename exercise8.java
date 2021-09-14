/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);
    
    System.out.println("How many people");
     int num = myObj.nextInt();
    
    System.out.println("How many pizzas do you have?");
     int num2 = myObj.nextInt();
     
     System.out.println("How many slices per pizza?");
      int num3 = myObj.nextInt();
    
    int slices = num * num2;
    int slicesPer = slices / num;
    int remainder = slices % num;
   
    System.out.println(num + " people with " + num2 + " pizzas" + " (" + slices + " slices" + ") ");
    System.out.println("Each person gets " + slicesPer + " pieces of pizza.");
    System.out.println("There are " + remainder + " leftover pieces.");
    
     }
}