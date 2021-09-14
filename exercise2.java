/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);  
    System.out.println("What is the input string?");

    String inputString = myObj.nextLine();  
    String string = inputString;    
        int count = 0;    
            
            
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        System.out.println(inputString + " has " + count + " Characters.");    
     }
}