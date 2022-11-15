import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escrevendonoarquivo {
    public static void main(String[] args) {
        
        String[] lines = new String[] {"Good morning","Good afternoon","Good night"};

        String path = "/home/beowulf/Documentos/out.txt";
        System.out.println();
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
    }
}
