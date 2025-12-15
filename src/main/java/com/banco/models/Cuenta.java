package com.banco.models;

import com.banco.interfaces.iOperacionesCuenta;

public abstract class Cuenta implements iOperacionesCuenta {

    // Atributos
    protected String titular;
    protected double saldo;
    protected String numeroCuenta;

    // Constructor
    public Cuenta(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    // Implementacion de interfaz

    // Metodo depositar.
    @Override
    public void depositar(double monto) {
        if (monto > 0) {
            IO.println("Deposito de $" + monto + " Existoso.");
        } else {
            IO.println("Monto de deposito no valido");
        }
    }

    // Metodo retirar

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

}