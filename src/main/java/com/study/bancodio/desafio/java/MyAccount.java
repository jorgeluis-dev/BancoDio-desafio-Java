package com.study.bancodio.desafio.java;

/**
 *
 * @author Jorge Luis Sampaio de Oliveira
 */
public interface MyAccount {
    void withdraw(double valor);
    void deposit(double valor);
    void transfer(double valor, BankAccount AccountDestiny );
    
    void imprimirExtrato();
    
}
