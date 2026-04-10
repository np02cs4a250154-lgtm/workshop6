package workshop;
import java.util.*;

public class workshop13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,8,1));

        Collections.sort(list);
        System.out.println("Ascending: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending: " + list);
    }
}