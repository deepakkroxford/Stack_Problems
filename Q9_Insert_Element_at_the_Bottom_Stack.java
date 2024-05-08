import java.util.Scanner;
import java.util.Stack;

/**
 * Q9_Insert_Element_at_the_Bottom_Stack
 */

class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {

        Stack<Integer> temp = new Stack<>();
        while (st.size() > 0) {
            int cur = st.pop();
            temp.push(cur);
        }

        st.push(x);
        while (temp.size() > 0) {
            int cur = temp.pop();
            st.push(cur);
        }
        return st;

    }
}

public class Q9_Insert_Element_at_the_Bottom_Stack {

    public static void main(String[] args) {

        /*GFG 
         * You are given a stack st of n integers and an element x. You have to insert x
         * at the bottom of the given stack.
         * 
         * Note: Everywhere in this problem, the bottommost element of the stack is
         * shown first while priniting the stack.
         * 
         * Example 1:
         * 
         * Input:
         * n = 5
         * x = 2
         * st = {4,3,2,1,8}
         * Output:
         * {2,4,3,2,1,8}
         * Explanation:
         * After insertion of 2, the final stack will be {2,4,3,2,1,8}.
         * Example 2:
         * 
         * Input:
         * n = 3
         * x = 4
         * st = {5,3,1}
         * Output:
         * {4,5,3,1}
         * Explanation:
         * After insertion of 4, the final stack will be {4,5,3,1}.
         * Your Task:
         * 
         * You don't need to read input or print anything. Your task is to complete the
         * function insertAtBottom() which takes a stack st and an integer x as inputs
         * and returns the modified stack after insertion.
         * 
         * Expected Time Complexity: O(n)
         * Expected Auxiliary Space: O(n)
         * 
         * Constraints:
         * 1 <= n <= 105
         * 0 <= x, elements of stack <= 109
         * 
         */

        Scanner sc = new Scanner(System.in);
        Solution ans = new Solution();

        Stack<Integer> stack = new Stack<>();
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("enter the number of element you want to insert stack");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            stack.push(x);
        }

        System.out.println("enter the value u wante to put at buttom");
        int x = sc.nextInt();

        System.out.println(ans.insertAtBottom(stack, x));

    }
}