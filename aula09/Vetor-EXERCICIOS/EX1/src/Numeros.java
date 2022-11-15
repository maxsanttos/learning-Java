import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();

        int[] number = new int[num];

        for (int i = 0; i < number.length; i++) {
            System.out.print("Digite um numero: ");
            number[i] = sc.nextInt();
          
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 0) {
                System.out.println(number[i]);
            }
        }
       









        sc.close();
    }
}
