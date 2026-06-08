package com.ulp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 Calcular Cotización: Determinar el valor de cotización unitario basándose en el total recibido (ej: si dan U$S
1620 por $1800000, ¿a cuánto cotiza?). El método debe lanzar una ArithmeticException si el monto en pesos ingresado es 0. 
 */
public class CotizacionTest {

    public CotizacionTest() {
    }

    @Test
    public void testCotizarCero() {
        ConversorMoneda conversor = new ConversorMoneda();

        assertThrows(ArithmeticException.class, () -> {
            conversor.calcularCotizacion(0.0, 1620.0);
        }, "Deberia lanzar ArithmeticException cuando el monto en pesos es 0");
    }
}