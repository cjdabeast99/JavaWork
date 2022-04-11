/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testing;
import java.util.Scanner;

/**
 *
 * @author cjgar
 */
public class Testing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter random word: ");  
        String input= sc.nextLine(); 
        System.out.println("You entered:" + input);
        GetChars(input);
    }
    
    public static void GetChars(String value)
    {
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            count = (i+ 1);
            System.out.print("[" + count + "] " + value.charAt(i) + "\n");
        }
        System.out.print("There was a total of " + count + " characters");
    }
}
