import java.util.Locale;

public class aula02 {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

       /* double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;*/

        int a, b;
        double resultado;

        a = 5;
        b = 2;
        resultado = (double) a / b; /*casting*/

        System.out.println(resultado);

        
        /*formatação de numero
        System.out.printf("%.4f%n", x);
        System.out.printf("%.2f%n", x);
        System.out.println("Resultado = " + x +" Metros");
        System.out.printf("Resultado = %.2f Metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f Reais %n", nome, idade, renda);*/
    }
}
