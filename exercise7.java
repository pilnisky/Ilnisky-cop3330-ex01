/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);
    
    System.out.println("What is the length of the room in feet?");
    double num = myObj.nextDouble();
    
    System.out.println("What is the width of the room in feet?");
    double num2 = myObj.nextDouble();
    
    double area = num * num2;
    double sqm = area * 0.09290304;
   
    System.out.println("You entered dimensions of " + num + " by " + num2);
    System.out.println("The area is " + area + " square feet");
    System.out.println(sqm + " square meters");
    
     }
}