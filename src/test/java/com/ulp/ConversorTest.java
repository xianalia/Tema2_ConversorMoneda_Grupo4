package com.ulp;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ConversorTest {

    private static ConversorMoneda conversor;

    @BeforeAll
    static void iniciarConversor() {
        conversor = new ConversorMoneda();
        System.out.println("*-*-*Bienvenid@ al sistema de conversión*-*-*");
    }

    @BeforeEach
    void mostrarPruebaActual(TestInfo testInfo) {
        System.out.println("Ejecutando test..."+ testInfo.getDisplayName());
    }

    @Test
    void testAumentarSaldo() {
        double saldoActual = 500;
        double compra = 200;

        double resultado = conversor.aumentarSaldo(saldoActual, compra);

        assertEquals(700, resultado, 0.001);
    }

    @Test
    void testRetirarDolarFisico() {
        double saldoActual = 2100;
        double retiro = 100;

        double resultado = conversor.retirarDolarFisico(saldoActual, retiro);

        assertEquals(2000, resultado, 0.001);
    }

    @AfterEach
    void despuesDeCadaPrueba() {
        System.out.println("Prueba finalizada, campos en $0");
    }

    @AfterAll
    static void finalizar() {
        System.out.println("La operación ha finalizado");
    }
}
