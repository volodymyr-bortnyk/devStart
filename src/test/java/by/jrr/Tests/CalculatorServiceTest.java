package by.jrr.Tests;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    public void sum() {
        int expected = 3;
        int actual =  calculatorService.sum(1,2);
        assertEquals(expected, actual);
    }

    @Test
    public void sub() {
        assertEquals(3 , calculatorService.sum(1,2));
    }

    @Test
    public void deleniy() throws Exception {
        int a = 10;
        int b = 0;
        int expected = 0;
        assertEquals(expected, calculatorService.delenie(a,b));
    }

    @Test
    public void substring() {
        String expected = "privet";
        String text = "anton  privet";
        int a = 6;
        assertEquals(expected, calculatorService.substring(text,a));
    }
}