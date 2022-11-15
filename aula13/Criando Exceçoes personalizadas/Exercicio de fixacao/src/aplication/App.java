package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.entities.exceptions.DomainException;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Numero: ");
        int num = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double balanceIni = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double limiteBalance = sc.nextDouble();

        Account acc = new Account(num, holder, balanceIni, limiteBalance);
        
        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = sc.nextDouble();
        try {
            // methods de saque
            acc.withdraw(amount);
            System.out.printf("Novo Saldo: %.2f%n",acc.getBalance());

        } catch (DomainException e) {
            System.out.println("Erro de saque: "+ e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected error");
        }
        sc.close();
    }
}
