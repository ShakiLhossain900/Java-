/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basicAddSub;

/**
 *
 * @author Itanium
 */
import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        
        System.out.print("Please enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("plese enter second number: ");
        int num2 = input.nextInt();
        
        int sum = num1+num2;
        
        System.out.println("The sum of the two number is: " + sum );
        
    } 
}
