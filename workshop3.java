package workshop;
import java.util.*;

public class workshop3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        System.out.println("Is Empty: " + list.isEmpty());

        list.addFirst("First");
        list.addLast("Last");

        System.out.println("LinkedList: " + list);
    }
}
