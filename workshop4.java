package workshop;
import java.util.*;

public class workshop4{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Collections.rotate(list, 2);

        System.out.println("Rotated List: " + list);
    }
}