package workshop;
import java.util.*;

public class workshop6 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Read");
        stack.push("Write");
        stack.push("Code");

        stack.pop();

        stack.push("Debug");
        stack.push("Test");

        System.out.println("Top: " + stack.peek());
        System.out.println("Stack: " + stack);
    }
}