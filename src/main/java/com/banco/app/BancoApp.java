package com.banco.app;

import com.banco.interfaces.iOperacionesCuenta;
import com.banco.models.CuentaAhorros;

// Importar colecciones
import java.util.ArrayList;
import java.util.List;

public class BancoApp {

    void main() {
        // Creacion de objetos

        iOperacionesCuenta ctaMauricio = new CuentaAhorros("Mauricio L.", "1001A", 1500.00, 0.05);
        iOperacionesCuenta ctaJuan = new CuentaAhorros("Juan Garces", "2002B", 800.00, 0.07);

        // Creamos una listo que solo acepta objetos que cumplen con el contrato iOperacionesCUenta
        List<iOperacionesCuenta> cuentasActivas = new ArrayList<>();
        cuentasActivas.add(ctaMauricio);
        cuentasActivas.add(ctaJuan);

        IO.println("--- Pruebas de Operaciones ---");
        //Llamar al metodo

        for (iOperacionesCuenta cuenta: cuentasActivas) {
            IO.println(" ");
            //Llamar a depositar
            cuenta.depositar(200.00);

            //Llamar a retirar
            cuenta.retirar(100.00);

            //Llamar a mostrarInformacion
            cuenta.mostrarInformacion();
        }

        IO.println("\n--- Aplicando Interes ---");

        if (ctaMauricio instanceof CuentaAhorros) {
            ((CuentaAhorros) ctaMauricio).aplicarInteres();
        }

        IO.println("\n--- Fin de Pruebas ---");
        ctaMauricio.mostrarInformacion();

    }

}