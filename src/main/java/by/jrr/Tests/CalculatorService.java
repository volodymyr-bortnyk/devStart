package by.jrr.Tests;

public class CalculatorService {

    public int sum(int a, int b){
        return a + b;

    }

    public int sub(int a, int b){
        return a-b;
    }

    public int delenie(int a, int b) throws Exception {
        if(b != 0){
            return  a/b;
        }else{
            throw new Exception("Деление на ноль");
        }
    }

    public String substring(String text, int a){
        return text.substring(a);
    }
}
