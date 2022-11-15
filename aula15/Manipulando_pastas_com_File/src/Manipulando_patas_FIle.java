import java.io.File;
import java.util.Scanner;

public class Manipulando_patas_FIle {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Enter a folder path:(/home/beowulf/....)");
        System.out.print("Path => ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println();
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println();
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }
        // CRAINDO UMA SUBPASTA
        boolean sucess = new File(strPath + "/subdir").mkdir();
        System.out.println("Directory created successfully: " + sucess);
        sc.close();
    }
}
