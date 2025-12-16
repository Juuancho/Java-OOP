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
            this.saldo += monto;
            IO.println("Deposito de $" + monto + " Exitoso.");
        } else {
            IO.println("Monto de deposito no valido");
        }
    }

    // Metodo retirar
    @Override
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            IO.println("Retiro de $" + monto + " exitoso. Nuevo saldo: $" + this.saldo);
            return true;
        } else {
            IO.println("Retiro fallido. Saldo insuficiente.");
            return false;
        }
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

}