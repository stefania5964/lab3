package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TarifasTest {

    @Test
    public void invalido_genera_excepcion() {
        try{
            double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(-1000,-2,-1);
        }
        catch(Exception e){
            assertTrue(true);
        }
    }
    @Test
    public void valido_no_descuentos(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(1000,5,25);
        assertEquals(1000, result, 0);
    }
    @Test
    public void descuento_dias_edadMenor(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(1000,25,5);
        assertEquals(800, result, 0);
    }
    @Test
    public void descuento_dias_edadMayor(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(1000,25,67);
        assertEquals(770, result, 0);
    }
    @Test
    public void descuento_dias(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(1000,25,28);
        assertEquals(850, result, 0);
    }
    @Test
    public void descuento_edadMenor(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(1000,3,5);
        assertEquals(950, result, 0);
    }
    @Test
    public void descuento_edadMayor(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(1000,3,67);
        assertEquals(920, result, 0);
    }
    @Test
    public void descuento_frontera_dias(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(1000,21,24);
        assertEquals(850, result, 0);
    }
    @Test
    public void descuento_frontera_menor(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(1000,5,17);
        assertEquals(950, result, 0);
    }
    @Test
    public void descuento_frontera_mayor(){
        double result = edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos.calculoTarifa(1000,5,66);
        assertEquals(920, result, 0);
    }
}

