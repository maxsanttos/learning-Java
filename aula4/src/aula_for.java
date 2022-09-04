import java.util.Scanner;

public class aula_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de repetição: ");
        int N = sc.nextInt();

        int soma = 0;

        for (int i = 0; i < N; i++){
            System.out.print("Informe um número: ");
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);

        sc.close();
    }
    
}
