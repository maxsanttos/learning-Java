package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		// Pedido para apontar o diretorio e o arquivo que será criado summary.csv
        System.out.println("\n");
        System.out.println("Enter a folder path)");
        System.out.print("Path => ");
        String strPath = sc.nextLine();

		File sourceFile = new File(strPath);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "/out").mkdir();
		
		String targetFileStr = sourceFolderStr + "/out/summary.csv";
		// lendo arquivo Ipunt
		String arqIpunt = "/home/beowulf/Documentos/Input.csv";
		System.out.println();
        System.out.println("Lendo");
        try(BufferedReader br = new BufferedReader(new FileReader(arqIpunt))){
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done!");
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, quantity));

				itemCsv = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				System.out.println();
				System.out.println(targetFileStr + " CREATED!");
				
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		System.out.println();
		System.out.println("Lendo");
		try(BufferedReader br2 = new BufferedReader(new FileReader(targetFileStr))){
			String line = br2.readLine();

			while (line != null) {
				System.out.println(line);
				line = br2.readLine();
			}
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Done!");
		sc.close();
    }
}
