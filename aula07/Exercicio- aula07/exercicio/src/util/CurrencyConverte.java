package util;

public class CurrencyConverte{
    
    public static double converter (double dollar, double real){
        double porcento = (dollar * real) * 6/100;
        return real * dollar + porcento;
    }

}