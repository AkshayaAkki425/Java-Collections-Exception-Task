import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Akshaya");
        students.add("Rahul");
        students.add("Sneha");

        System.out.println("Students List:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}