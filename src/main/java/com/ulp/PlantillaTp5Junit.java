/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ulp;

/**
 *
 * @author juanj
 */
public class PlantillaTp5Junit {

    public static void main(String[] args) {
        ConversorMoneda conversor = new ConversorMoneda();
        
        //Metodo Convertir Moneda
        double pesitos = conversor.convertirMoneda(1200, 1450);
        System.out.println("Ahora tienes: "+ pesitos +" pesos.");
        
        //Metodo Calcular Cotización
        double cotizacion = conversor.calcularCotizacion(1800000, 1620);
        System.out.println("Valor de la cotizacion: "+ cotizacion);
         
        //Metodo Aumentar Saldo
        double ganancia = conversor.aumentarSaldo(500, 165);
        System.out.println("Tu saldo actual es: "+ganancia); 
        
        //Metodo Retirar Dolar Fisico
        double saldo = conversor.retirarDolarFisico(2100, 100);
        System.out.println("Tu saldo actual es: "+saldo); 

    }
}
