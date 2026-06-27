import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Akshaya");
        students.put(102, "Rahul");
        students.put(103, "Sneha");

        System.out.println("Student Details:");

        for (Integer id : students.keySet()) {
            System.out.println(id + " : " + students.get(id));
        }
    }
}