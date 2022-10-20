/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author rifqi
 */
public class Account {
    private int accNumber;
    private String statusCode;
    private int amountOfSale;

    public Account(int accNumber, String statusCode, int amountOfSale) {
        this.accNumber = accNumber;
        this.statusCode = statusCode;
        this.amountOfSale = amountOfSale;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public int getAmountOfSale() {
        return amountOfSale;
    }

    public void setAmountOfSale(int amountOfSale) {
        this.amountOfSale = amountOfSale;
    }

    
    
    
}
