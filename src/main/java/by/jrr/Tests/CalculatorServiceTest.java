package by.jrr.Tests;

import java.util.Calendar;

public class CalculatorServiceTest {

    public static int totalTest = 0;
    public static int testSuccess = 0;
    public static int failedTest = 0;

    public void runTests(){
        try {
            totalTest++;
            sum();
            testSuccess++;
        } catch (Exception e){
            failedTest++;
            e.printStackTrace();
        }
        try {
            totalTest++;
            sub();
            testSuccess++;
        } catch (Exception e){
            failedTest++;
            e.printStackTrace();
        }
    }

    private void assertEquals(int expected, int actual) throws Exception {
        if(expected == actual){
            System.out.println("Test Success");
        } else {
                throw new Exception("Test FAILED");
        }
    }

    //Test 1
    private void sum() throws Exception {
        int a = 1;
        int b = 2;
        int expected = 3;
        CalculatorService calculatorService = new CalculatorService();
        int actual = calculatorService.sum(a, b);
        assertEquals(expected, actual);
    }

    //Test 2
    private void sub() throws Exception {
        int a = 1;
        int b = 2;
        int expected = -1;
        CalculatorService calculatorService = new CalculatorService();
        int actual = calculatorService.sub(a,b);
        assertEquals(expected, actual);
    }
}
