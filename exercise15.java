/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class main{

     public static void main(String []args){
       Scanner myObj = new Scanner(System.in);
    

    System.out.println("What is the password?");
    String name = myObj.nextLine();
    
    if(name.equals("abc$123")){
        System.out.println("Welcome!");
    } else{
        System.out.println("I don't know you.");
    }
 
     }
}