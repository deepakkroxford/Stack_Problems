import java.util.Stack;

public class Q2_Insert_at_any_pos {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("before insertion" + stack);
        int pos = 2;
        Stack<Integer> s1 = new Stack<>();
        while (stack.size() > pos) {
            s1.push(stack.pop());
        }

        stack.push(8);
        System.out.println("\nafter inserting 8 and 10");

        while (s1.size() > 0) {
            stack.push(s1.pop());
        }
        System.out.println(stack);

    }
}
