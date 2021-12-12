import pacote1.dog;
import pacote2.person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Java!");
        dog d1 = new dog();
        person p1 = new person();
        d1.bark();
        p1.hello();

    }
}
