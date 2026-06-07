package com.ulp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorMonedaTest {

    @DisplayName("Programa Conversor de Moneda")
    @Before
    public void msj(){
        System.out.println("Prueba conversor #1");
    }

    @Test
    public void testConversorMoneda(){
        ConversorMoneda conversor= new ConversorMoneda();
        double monto = 1000;
        double cotizacion= 1450;
        double peso = conversor.convertirMoneda(monto,cotizacion);

        assertEquals(1000*1450,peso,"valores iguales");
        System.out.println("el resultado que se espera es "+monto*cotizacion+" y el obtenido es "+peso);
    }

    @After
    public void pruebaFin(){
        System.out.println("Prueba Finalizada");
    }

}
