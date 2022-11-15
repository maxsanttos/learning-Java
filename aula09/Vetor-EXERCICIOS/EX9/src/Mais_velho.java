import java.util.Scanner;

public class Mais_velho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int pessoas = sc.nextInt();

        String[] nomes = new String[pessoas];
        int[] idade = new int[pessoas];

        for (int i = 0; i < nomes.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int maioridade = idade[0];
        int posicaomaior = 0;


        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > maioridade) {
                maioridade = idade[i];
                posicaomaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaomaior]);


        sc.close();
    }
}
