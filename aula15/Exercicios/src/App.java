import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        String[] lines = new String[] {"TV LED, 1290.99","1 Video Game Chair, 350.50","3 Iphone X, 900.00","2 Samsug Galaxy 9,850.00,2"};

        // Pedido para apontar o diretorio e o arquivo que será criado summary.csv
        System.out.println("\n");
        System.out.println("Enter a folder path:(/home/beowulf/....)");
        System.out.print("Path => ");
        String strPath = sc.nextLine();
        
        // CRAINDO UMA SUBPASTA
        boolean sucess = new File(strPath + "/out").mkdir();
        System.out.println("Directory created successfully: " + sucess);

        // outro caminho, já dentro do diretorio "out"
        String path = "/home/beowulf/Documentos/out/summary.csv";
        // Criando o arquivo
        System.out.println("Escrevendo");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Done!");
        // lendo
        System.out.println();
        System.out.println("Lendo");
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done!");

        sc.close();
    }
}
