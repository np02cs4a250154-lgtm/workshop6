package workshop;
import java.util.*;

public class workshop14 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red","Blue","Green"));

        Collections.sort(colors);
        System.out.println("Ascending: " + colors);

        Collections.sort(colors, Collections.reverseOrder());
        System.out.println("Descending: " + colors);
    }
}