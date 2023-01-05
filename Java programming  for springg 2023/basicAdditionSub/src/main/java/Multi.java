/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Itanium
 */
import java.util.Scanner;
public class Multi {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first nubmer =");
        int number1 = input.nextInt();
        
        System.out.print("enter the second number =");
        int number2 = input.nextInt();
        
        int multi = number1*number2;
        
        System.out.println("the sub is = "+ multi);
        
        
    }
}
