package com.example.parcial2corte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciUnitTest {
    @Test
    public void testCalcularFibonacci() {
        assertEquals(0, calcularFibonacci(0));
        assertEquals(1, calcularFibonacci(1));
        assertEquals(1, calcularFibonacci(2));
        assertEquals(2, calcularFibonacci(3));
        assertEquals(3, calcularFibonacci(4));
        assertEquals(5, calcularFibonacci(5));
        assertEquals(8, calcularFibonacci(6));
        assertEquals(13, calcularFibonacci(7));
        assertEquals(21, calcularFibonacci(8));
        assertEquals(34, calcularFibonacci(9));
    }

    private int calcularFibonacci(int numero) {
        if (numero <= 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
        }
    }
}


