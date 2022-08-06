package com.study.bancodio.desafio.java;

/**
 *
 * @author Jorge Luis Sampaio de Oliveira
 */

public abstract class BankAccount implements MyAccount{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public BankAccount() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    
    public void depositar(double valor) {
        this.saldo += valor;
    }

    
    public void transferir(double valor, BankAccount contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}

