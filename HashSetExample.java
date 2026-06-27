import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("Fruits:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}