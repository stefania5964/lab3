package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TarifasTest {

    @Test
    public void test() {
        double respuesta = 95000;
        double calculo = CalculadorDescuentos.calculoTarifa(100000, 5, 15);
        System.out.println(calculo);
        assertEquals(respuesta,calculo,0);
        assertTrue(true);
    }

}
