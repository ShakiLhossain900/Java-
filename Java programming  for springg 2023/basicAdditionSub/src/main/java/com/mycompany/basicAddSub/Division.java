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

public class Division {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
                
                System.out.print("Enter the first number = ");
                        int num1 = input.nextInt();
                
                System.out.print("enter the second number = ");
                int num2 = input.nextInt();
                
                int div = num1 / num2;
                
                System.out.println("the sub is = "+ div);
                
    }
    
}
