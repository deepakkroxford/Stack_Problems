import java.util.Stack;

/**
 * 1_Basic_of_Stack
 */
public class f1_Basic_of_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.size()); // it will give 0
        stack.push(10);
        stack.push(1);
        stack.push(110);
        stack.push(120);
        stack.push(170);
        stack.push(1620);
        System.out.println(stack);
        // stack.pop(); // remove the top element of the stack, if it is empty a
        // NoSuchElementException will be thrown // [10, 1, 1
        // System.out.println(stack);
        // System.out.println(stack.peek());
        System.out.println(stack.size() + " elements in the stack"); // this is used for print the size of stack

        // print by using loop
        System.out.println("Stack elements:");
        while (!stack.isEmpty()) {
            // Print and pop the top element of the stack
            System.out.println(stack.pop());
        }

    }

}