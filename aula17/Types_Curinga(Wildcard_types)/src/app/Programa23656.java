package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa23656 {
    public static void main(String[] args) {
        
        List<Integer> myInts = Arrays.asList(5,2,10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
        System.out.println();
        printList(myStrs);
    }

    // methods para imprimir uma lista
    public static void printList(List<?> list){
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
