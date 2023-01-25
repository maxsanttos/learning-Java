import java.util.Comparator;

public class App {

    public class MyComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        }
    }

    public static void main(String[] args) {
        
        //list.sort(new MyComparator())

    }
}
