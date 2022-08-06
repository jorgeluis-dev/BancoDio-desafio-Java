package com.study.bancodio.desafio.java;

/**
 *
 * @author Jorge Luis Sampaio de Oliveira
 */
public class SavingsAccount extends BankAccount {

    public void printExtract(){
        System.out.println("Check your bank statement below");
        super.imprimirInfosComuns();
    }
    @Override
    public void withdraw(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deposit(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void transfer(double valor, BankAccount AccountDestiny) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void imprimirExtrato() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
