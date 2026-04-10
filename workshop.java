package workshop;

import java.util.*;

public class workshop {                                                                                                                                      

    public static void main(String[] args) {

        // ArrayList Example
        ArrayList<String> students = new ArrayList<>();
        students.add("Ram");
        students.add("Sita");
        students.add("Hari");

        students.remove("Sita");

        System.out.println("Students: " + students);
    }
}