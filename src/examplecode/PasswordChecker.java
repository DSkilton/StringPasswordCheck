/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplecode;

import java.util.Scanner;

/**
 *
 * @author MC03353
 */
public class PasswordChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Welcome to PGO Security Systems");
        System.out.println("*******************************");
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter password");
        String password = sc.next();
        
        if (password.equals("abcd1234")){
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied"); 
        }
    }
}
