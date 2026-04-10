package workshop;
import java.util.*;

public class workshop2 {
    public static void main(String[] args) {
        ArrayList<String> examinees = new ArrayList<>();

        examinees.add("A");
        examinees.add("B");
        examinees.add("C");
        examinees.add("D");
        examinees.add("E");

        examinees.remove("C");

        System.out.println("Updated List: " + examinees);
    }
}