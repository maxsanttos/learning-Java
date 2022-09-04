import java.util.Locale;
import java.util.Scanner;

public class aula03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos;
        double conta = 50.0;

        System.out.println("Informe os minutos: ");
        minutos = sc.nextInt();

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta:R$ %.2f%n", conta);

        sc.close();

    }
}
