package application;

public class foreach {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob","Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println();
        System.out.println("foreach");
        System.out.println();
        for (String nomes : vect) {
            System.out.println(nomes);
        }
    }
}
