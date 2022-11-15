import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String srtPath = sc.nextLine();

        File path = new File(srtPath);

        // Nome do arquivo
        System.out.println("getName: " + path.getName());
        // Pasta pai
        System.out.println("getParent: " + path.getParent());
        // Caminho até o arquivo
        System.out.println("getPath: " + path.getPath());
    



        sc.close();
    }
}
