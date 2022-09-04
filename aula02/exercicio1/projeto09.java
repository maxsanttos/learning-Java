package aula02.exercicio1;

public class projeto09 {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B,C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + "= " + A);
        System.out.println("Raiz quadrada de " + "= " + B);
        System.out.println("Raiz quadrada de 25 é = " + C);

        A = Math.pow(x,y);
        B = Math.pow(y,2.0);
        C = Math.pow(5.0,2.0);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado " + y + " = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        

        System.out.println("Valores absoluto "+ y + " = " + A);
        System.out.println("Valores absoluto "+ z + " = " + B);
        

        

    }
}
