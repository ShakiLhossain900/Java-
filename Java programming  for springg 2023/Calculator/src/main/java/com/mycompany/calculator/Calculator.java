
package com.mycompany.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        
        double num1, num2;
        char operator;
        double result;
        
        System.out.println("Enter the first number = ");
        num1 = input.nextDouble();
        
        System.out.println("Enter the second number = ");
        num2 = input.nextDouble();
        
        System.out.println("Enter the operator (+, -, *, /):");
        operator = input.next().charAt(0);
        
        switch(operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Invalid operator");
              return;
        }
        System.out.println("The result is : "+ result);
        
        
    }
   
}
