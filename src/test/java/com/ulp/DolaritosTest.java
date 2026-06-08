package com.ulp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DolaritosTest {
    @ParameterizedTest
    @CsvSource({
        "180000, 1500, 120",
        "120000, 0, 0",
        "100000, -900, 111.11"
    })
    
    void testCalcularCotizacion(double monto1, double monto2, double resultadoEsperado){
        ConversorMoneda conversor = new ConversorMoneda();
        double resultadoActual = conversor.calcularCotizacion(monto1, monto2);
        
        assertEquals(resultadoEsperado, resultadoActual);
    }
}
