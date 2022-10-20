/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;

/**
 *
 * @author rifqi
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Account acc1 = new Account(1234, "invalid", 50);
        //Account acc2 = new Account(2345, "invalid", 30);
        //Account acc3 = new Account(3456, "valid", 40);
        
        String invoice;
        
        System.out.print("Please input your account number: ");
        int accN = input.nextInt();
        
        if (accN == acc1.getAccNumber() && acc1.getStatusCode() == "valid") {
            invoice = "Account Number: " + Integer.toString(acc1.getAccNumber()) + " | Amount of Sale: " +Integer.toString(acc1.getAmountOfSale());
            System.out.println(invoice);
        } else {
            System.out.println("Something wrong with the account.");
        }
        
    }
    
}
