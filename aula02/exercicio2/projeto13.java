package aula02.exercicio2;

import java.util.Scanner;

public class projeto13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hinicial, hfinal;
         
        System.out.println("Hora inicial:");
        hinicial = sc.nextInt();
        System.out.println("Hora final:");
        hfinal = sc.nextInt();

        int duracao;

        if (hinicial < hfinal) {
            duracao = hfinal - hinicial;
        }else{
            duracao = 24 - hinicial + hfinal;
        }
        
        System.out.println("O JOGO DURO " + duracao +" HORAS(s)");
        sc.close();
    }
}
