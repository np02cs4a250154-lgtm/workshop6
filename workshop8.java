package workshop;
import java.util.*;

public class workshop8 {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();

        queue.add("Document1");
        queue.add("Document2");
        queue.add("Document3");

        queue.poll();

        queue.add("Document4");
        queue.add("Document5");

        System.out.println("Next Job: " + queue.peek());
        System.out.println("Queue: " + queue);
    }
}