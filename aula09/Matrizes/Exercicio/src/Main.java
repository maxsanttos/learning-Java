import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero de linhas: ");
        int m = sc.nextInt();
        System.out.print("Informe o numero de colunas: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Digite um numero para X: ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Informe um numero da matriz para pesquisa: ");
        int x = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x){
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1){
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}