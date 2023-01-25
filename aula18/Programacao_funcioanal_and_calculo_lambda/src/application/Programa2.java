package application;

import java.util.Arrays;

public class Programa2 {

    public static int globalValue = 3;
    public static void main(String[] args) {
        
        int[] vect = new int[] {3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }

    // não tem transparencia referecial, pois dependi de outra variavel 
    public static void changeOddValues(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValue;
            }
        }
    }
}
