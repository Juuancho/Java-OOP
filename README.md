# Java Demo Project

Este proyecto es una demostración práctica de los fundamentos de la Programación Orientada a Objetos (POO) utilizando las últimas características de Java 25. Simula un sistema bancario básico para ilustrar cómo interactúan diferentes componentes de software mediante contratos y jerarquías.

## Estructura del Proyecto

El código está organizado en tres partes principales dentro de `src/main/java/com/banco`:

1.  **`/interfaces` (El Contrato)**
    *   `iOperacionesCuenta.java`: Define las reglas obligatorias. Cualquier cuenta bancaria debe saber depositar, retirar y mostrar su información. No dice *cómo* hacerlo, solo que *debe* hacerse.

2.  **`/models` (Los Datos)**
    *   `Cuenta.java`: Es la base común. Contiene lo que todas las cuentas comparten (titular, saldo, número). Es "abstracta" porque no se puede usar por sí sola, sirve de molde para otras.
    *   `CuentaAhorros.java`: Es una versión específica y completa. Hereda todo lo de `Cuenta` pero añade sus propias reglas, como tener una tasa de interés y validar que haya fondos antes de retirar.

3.  **`/app` (La Ejecución)**
    *   `BancoApp.java`: Es el punto de entrada. Crea varias cuentas y las agrupa en una lista única. Gracias al polimorfismo, el sistema puede procesar todas las cuentas juntas sin necesitar código separado para cada tipo.

## Conceptos Clave

*   **Polimorfismo**: La capacidad del sistema para tratar distintos tipos de cuentas (como Ahorros o Corriente) de manera uniforme a través de una interfaz común.
*   **Herencia**: Reutilización de código donde `CuentaAhorros` obtiene automáticamente las características de `Cuenta`.
*   **Encapsulamiento**: Protección de los datos internos (como el saldo), permitiendo el acceso solo a través de métodos controlados.

## Requisitos
*   Java 25 (Preview Features habilitadas)
