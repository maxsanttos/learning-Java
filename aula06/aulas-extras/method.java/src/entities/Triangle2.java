package entities;

public class Triangle2 {

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a+ b + c) / 2.0;
        double result = Math.sqrt( p * ( p - a) * (p - b) * (p - c));
        return result;
    }

    
}
