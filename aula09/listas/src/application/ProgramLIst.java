package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ProgramLIst
 */
public class ProgramLIst {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        //adcionando na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        // adcionando em posições escolhidas
        list.add(2, "Max");

        // tamanho
        System.out.println(list.size());

        //imprimindo lista
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------------------------------------");

        /*removendo
        list.remove("Anna");
        list.remove(1);*/
        // removendo com predicado ou lambda
        list.removeIf(x -> x.charAt(0) == 'M');
        //imprimindo lista
        for (String x : list) {
            System.out.println(x);
        }

        // busca posições dos elementos
        System.out.println("-------------------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco")); //quando não encontra retorna -1

        // filtrando a lista e deixando apenas elementos que contem apenas um certo predicado
        System.out.println("-------------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        // encontrado elemento da lista que atendo um certo predicado
        System.out.println("-------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);



    }
}