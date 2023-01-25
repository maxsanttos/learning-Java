package application;

public class UI {


    // Limpar a tela
    public static void clearScreen(){
        System.out.println();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Menu
    public static void mostarMenu(){
        System.out.println();
        System.out.println("=======================================");
        System.out.println("BEM-VINDA(O) AO SISTEMA");
        System.out.println("=======================================");
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("1 - Registrar Funcionario ");
        System.out.println("2 - Sair");
        System.out.println("--------------------------------------------");
    }
}
