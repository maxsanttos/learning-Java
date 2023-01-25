package application;

import java.util.ArrayList;

import java.util.List;

import entities.Produto;

public class Programa_101 {
    public static void main(String[] args) {
        
        
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv",900.00));
        list.add(new Produto("Notebook",1200.00));
        list.add(new Produto("Tablet",450.00));
        
        //Collections.sort(list);
        //list.sort(new MyComparator());
        list.sort((p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        for (Produto produto : list) {
            System.out.println(produto);
        }
    }
}
