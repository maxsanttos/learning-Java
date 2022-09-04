import java.util.Locale;
import java.util.Scanner;

public class aula_facaenquanto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char op;
        do {

            System.out.println("");
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32;
            System.out.printf("Equivale em Fahrenheit: %.1f%n",f);
            System.out.print("Deseja repetir (s/n)? ");
            op = sc.next().charAt(0);
            System.out.println("");

        } while (op != 'n');


        sc.close();
    }
}
