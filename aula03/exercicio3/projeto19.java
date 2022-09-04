package aula03.exercicio3;

import java.util.Scanner;

public class projeto19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int semana;
        System.out.println("informe um número da semana => ");
        semana = sc.nextInt();

        switch (semana) {
            case 1:
                System.out.println("Dia da semana: Domingo");
                break;
            case 2:
                System.out.println("Dia da semana: Segunda");
                break;
            case 3:
                System.out.println("Dia da semana: Terça");
                break;
            case 4:
                System.out.println("Dia da semana: Quarta");
                break;
            case 5:
                System.out.println("Dia da semana: Quinta");
                break;
            case 6:
                System.out.println("Dia da semana: Sexta");
                break;
            case 7:
                System.out.println("Dia da semana: Sábado");
                break;
            default:
                System.out.println("Dia da semana:valor inválido");
                break;
        }
        sc.close();
    }
}
