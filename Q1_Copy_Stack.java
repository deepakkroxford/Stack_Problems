import java.util.*;

public class Q1_Copy_Stack {
    public static void main(String[] args) {
        /*
         * copy content of the stack in the same order
         */
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        // push elements to the stack user input
        // System.out.println("enter the value of n");
        // int n=sc.nextInt();
        // System.out.println("enter the number of element you want to insert stack");
        // for(int i =1;i<=n;i++)
        // {
        // int x=sc.nextInt();
        // stack.push(x);
        // }

        // System.out.println("Original Stack: ");
        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("origianl stack");
        System.out.println(stack);

        // reversed order
        Stack<Integer> gt = new Stack<>();
        while (stack.size() > 0) {
            int x = stack.peek();
            gt.push(x);
            stack.pop();

            /*
             * we can also
             * s1.push(stack.pop());
             */
        }

        Stack<Integer> ct = new Stack<>();
        while (gt.size() > 0) {
            ct.push(gt.pop());
        }

        System.out.println("copy stack");
        System.out.println(ct);

    }
}
