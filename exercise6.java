/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;
import java.util.Date;  

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);
       
        Date d = new Date();  
        int year = d.getYear();  
       
    
    System.out.println("What is your current age?");
    int num = myObj.nextInt();
    
    System.out.println("At what age would you like to retire?");
    int num2 = myObj.nextInt();
    
    int currentYear=year+1900;  
    int difference = num2 - num;
   
    System.out.println("You have " + difference + " years left until you can retire");
    System.out.println("Its " + currentYear + ", so you can retire in " + (currentYear + difference) );
    
     }
}