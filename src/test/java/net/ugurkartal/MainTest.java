package net.ugurkartal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void isFibonacci_when0_returnTrue(){
        int number = 0;
        boolean expected = Main.isFibonacci(number);
        assertTrue(expected);
    }

    @Test
    public void isFibonacci_when1_returnTrue(){
        int number = 1;
        boolean expected = Main.isFibonacci(number);
        assertTrue(expected);
    }

    @Test
    public void isFibonacci_when2_returnTrue(){
        int number = 2;
        boolean expected = Main.isFibonacci(number);
        assertTrue(expected);
    }

    @Test
    public void isFibonacci_when3_returnTrue(){
        int number = 3;
        boolean expected = Main.isFibonacci(number);
        assertTrue(expected);
    }

    @Test
    public void isFibonacci_when4_returnTrue(){
        int number = 4;
        boolean expected = Main.isFibonacci(number);
        assertFalse(expected);
    }

    @Test
    public void isFibonacci_when5_returnTrue(){
        int number = 5;
        boolean expected = Main.isFibonacci(number);
        assertTrue(expected);
    }

    @Test
    public void isFibonacci_when144_returnTrue(){
        int number = 144;
        boolean expected = Main.isFibonacci(number);
        assertTrue(expected);
    }

    @Test
    public void isFibonacci_when233_returnTrue(){
        int number = 233;
        boolean expected = Main.isFibonacci(number);
        assertTrue(expected);
    }

    @Test
    public void isFibonacci_when234_returnTrue(){
        int number = 234;
        boolean expected = Main.isFibonacci(number);
        assertFalse(expected);
    }

    @Test
    public void isFibonacci_when500_returnTrue(){
        int number = 500;
        boolean expected = Main.isFibonacci(number);
        assertFalse(expected);
    }

}