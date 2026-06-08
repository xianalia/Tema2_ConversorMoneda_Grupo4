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

    public double calcularCotizacion(double montoPesos, double montoDolares) {
        if (montoPesos == 0) {
            throw new ArithmeticException("El monto en pesos no puede ser cero.");
        }
        
        if(montoDolares == 0){
            return 0.0;
        }
        

        double resultado = Math.abs(montoPesos / montoDolares);
        
        return Math.round(resultado*100)/100.0;
    }

    public double aumentarSaldo(double saldoActual, double montoComprado) {
        return saldoActual + montoComprado;
    }

    public double retirarDolarFisico(double saldoActual, double montoRetirado) {
        return saldoActual - montoRetirado;
    }
}
