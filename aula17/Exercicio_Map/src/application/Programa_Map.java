package application;

import entities.LogUrna;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Programa_Map {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Map<LogUrna,Integer> urna = new TreeMap<>();
            String line = br.readLine();
            while (line != null){

                String[] fields = line.split(" ");
                String name = fields[0];
                String voto = fields[1];

                LogUrna logUrna = new LogUrna(name,voto);

                urna.put(logUrna,100);
                line = br.readLine();
            }
            System.out.println("All votos: ");
            for (LogUrna key : urna.keySet()){
                System.out.println(key + ": " + urna.get(key));
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
