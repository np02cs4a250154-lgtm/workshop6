package workshop;
import java.util.*;

public class workshop15 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,7,9));

        int index = Collections.binarySearch(list, 5);

        System.out.println("Element found at index: " + index);
    }
}