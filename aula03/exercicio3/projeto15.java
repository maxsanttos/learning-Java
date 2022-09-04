package aula03.exercicio3;

import java.util.Scanner;

public class projeto15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número => ");
        double numero = sc.nextDouble();

        if(numero < 0.0 || numero > 100.0){
            System.out.println("Fora de Intervalo");
        }else if (numero >= 25.0) {
            System.out.println("Invervalo [0,25]");
        }else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}else {
			System.out.println("Intervalo (75,100]");
		}
        sc.close();
    }
}
