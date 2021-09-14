/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);
    
    System.out.println("What is the length?");
     int num = myObj.nextInt();
    
    System.out.println("What is the width?");
     int num2 = myObj.nextInt();
     
    int gallons = 350;
    int area = num * num2;
    int remainder = area % gallons;
    
    if (gallons < area)
    {
        System.out.println("You will need to purchase 2 gallon of paint to cover " + area + " square feet");
    } else {
    
        System.out.println("You will need to purchase 1 gallon of paint to cover " + area + " square feet");
    }
    
    
     }
}