package workshop;
import java.util.*;

public class workshop7 {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String[] words = sentence.split(" ");

        Stack<String> stack = new Stack<>();

        for(String w : words) {
            stack.push(w);
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}