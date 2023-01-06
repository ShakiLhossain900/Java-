/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w3schoolpractice;

/**
 *
 * @author Itanium
 */
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter your age : ");
      int myage = sc.nextInt();
        int votingAge = 18;
        
        if(myage >= votingAge){
        System.out.println("Old enough for the vote");
        }
        else {
            System.out.println("Not old enough for the voting");
        }
    }
}
