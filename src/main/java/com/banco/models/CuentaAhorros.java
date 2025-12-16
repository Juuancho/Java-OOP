package com.banco.models;

// Herencia, extends de la clase base Cuenta
public class CuentaAhorros extends Cuenta {

    // Atributo, solo las Cuentas de Ahorro tienen tasa de interés.
    private double tasaInteres;

    public CuentaAhorros(String titular, String numeroCuenta, double saldoInicial, double tasaInteres) {
        super(titular, numeroCuenta, saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    // 1. Sobrescritura de retirar, implementación específica para Ahorros.
    @Override
    public boolean retirar(double monto) {
        // Regla: No puedes retirar si el saldo es insuficiente.
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            IO.println("Retiro de $" + monto + " exitoso de Ahorros. Nuevo saldo: $" + this.saldo);
            return true;
        } else {
            IO.println("Retiro fallido en Ahorros. Saldo insuficiente.");
            return false;
        }
    }

    // 2. Sobrescritura de mostrarInformacion, implementación específica para
    // Ahorros.
    @Override
    public void mostrarInformacion() {
        IO.println("--- Cuenta de Ahorros ---");
        IO.println("Titular: " + titular);
        IO.println("Número: " + numeroCuenta);
        IO.println("Saldo: $" + saldo);
        IO.println("Tasa de Interés: " + tasaInteres * 100 + "%");
    }

    // MÉTODOS ÚNICOS: Lógica que solo existe en CuentaAhorros
    public void aplicarInteres() {
        this.saldo += this.saldo * tasaInteres;
        IO.println("Interés aplicado. Saldo con interés: $" + this.saldo);
    }
}