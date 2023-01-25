import java.util.Scanner;

public class aula4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número => ");
        int x = sc.nextInt();

        while (x != 0) {
            System.out.print("Informe um número => ");
            x = sc.nextInt();
        }
        System.out.println("fim");

        sc.close();
    }


}
