package com.study.bancodio.desafio.java;

/**
 *
 * @author Jorge Luis Sampaio de Oliveira
 */
public class MainBank {

    public static void main(String[] args) {
        BankAccount CurrentAccount1 = new CurrentAccount();
        BankAccount Savingsaccount9 = new CurrentAccount();
        
        CurrentAccount1.deposit(58);
        CurrentAccount1.sacar(10);
        CurrentAccount1.transfer(30, CurrentAccount1);
        
        Savingsaccount9.deposit(88);
        Savingsaccount9.sacar(35);
        Savingsaccount9.transfer(52, CurrentAccount1);
        
        CurrentAccount1.imprimirExtrato();
        Savingsaccount9.imprimirExtrato();
    }
}


