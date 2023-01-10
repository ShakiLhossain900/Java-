/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w3schoolpractice;

/**
 *
 * @author Itanium
 */
public class BreakContinueWhileLoop {
    
    public static void main(String[] loop){
        int i=0;
        while(i<10){
            if(i==4){
              i++;
                  continue;
            }
            System.out.println(i);
            i++;
        }
    }  
}
