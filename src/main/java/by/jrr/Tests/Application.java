package by.jrr.Tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    public static void main(String[] args) throws Exception {
        CalculatorService calculatorService = new CalculatorService();
        Logger logger = LoggerFactory.getLogger(Application.class);
        logger.info("Use logger");
        System.out.println(calculatorService.substring("anton privet", 6));

    }
}
