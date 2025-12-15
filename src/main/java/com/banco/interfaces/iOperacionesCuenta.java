package com.banco.interfaces;

// Definicion del contrato que una cuenta debe hacer
public interface iOperacionesCuenta {

    void depositar(double monto);
    boolean retirar(double monto);
    void mostrarInformacion();
}