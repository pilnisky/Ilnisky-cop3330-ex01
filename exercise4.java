/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);
       
    
    System.out.println("Enter a noun:");
    String inputString = myObj.nextLine();  
    
    System.out.println("Enter a verb:");
    String inputString2 = myObj.nextLine();
    
    System.out.println("Enter an adjective:");
    String inputString3 = myObj.nextLine();  
    
    System.out.println("Enter an adverb:");
    String inputString4 = myObj.nextLine();  
    
    System.out.println("Do you " +  inputString2 + " your " + inputString3 + " " + inputString + " " + inputString4 + ". Thats sad.");
  
     }
}
