/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author xiana
 */
public class ConversorMoneda {
    
    
    public double convertirMoneda(double monto, double cotizacion) {
        return monto * cotizacion;
    }

    // Acá cambié para que la excepcion se lance cuando el monto en dolares (divisor) sea cero
    public double calcularCotizacion(double montoPesos, double montoDolares) {
        if (montoDolares == 0) {
            throw new ArithmeticException("El monto en dolares no puede ser cero.");
        }
        return montoPesos / montoDolares;
    }

    public double aumentarSaldo(double saldoActual, double montoComprado) {
        return saldoActual + montoComprado;
    }

    public double retirarDolarFisico(double saldoActual, double montoRetirado) {
        return saldoActual - montoRetirado;
    }
}
