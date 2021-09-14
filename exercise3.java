/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);  
    System.out.println("What is the quote?");

    String inputString = myObj.nextLine();  
    
    System.out.println("Who said it?");
    String inputString2 = myObj.nextLine();
    
    System.out.println(inputString2 + " says " + "\"" + inputString + "\"");
    
     }
}