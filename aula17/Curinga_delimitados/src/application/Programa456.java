package application;


import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;


public class Programa456 {

    public static void main(String[] args) {
        
        List<Shape> myshape = new ArrayList<>();
        myshape.add(new Rectangle(3.0,2.0));
        myshape.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myshape));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}