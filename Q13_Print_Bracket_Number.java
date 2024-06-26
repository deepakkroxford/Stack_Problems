import java.util.ArrayList;
import java.util.Stack;

class BracketNumbers {
    ArrayList<Integer> bracketNumbers(String S) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '(') {
                count++;
                st.push(count);
                ans.add(count);
            } else if (ch == ')') {
                ans.add(st.peek());
                st.pop();
            }
        }
        return ans;
    }
}

public class Q13_Print_Bracket_Number {
    public static void main(String[] args) {
        /*
         * Given a string S, the task is to find the bracket numbers.
         * 
         * Example 1:
         * 
         * Input: S = "(aa(bdc))p(dee)"
         * Output: 1 2 2 1 3 3
         * Explanation: The highlighted brackets in
         * the given string (aa(bdc))p(dee) has been
         * assigned the numbers as: 1 2 2 1 3 3.
         * Example 2:
         * 
         * Input: S = "(((()("
         * Output: 1 2 3 4 4 5
         * Explanation: The highlighted brackets in
         * the given string (((()( has been assigned
         * the numbers as: 1 2 3 4 4 5
         * User Task:
         * Your task is to complete the function bracketNumbers() which takes a single
         * string as input and returns a list of numbers. You do not need to take any
         * input or print anything.
         * Expected Time Complexity: O(|S|)
         * Expected Auxiliary Space: O(|S|)
         * 
         * Constraints:
         * 1 <= |S| <= 105
         * S contains lower case English alphabets, and '(', ')' characters
         * At any time the number of opening brackets are greater than closing brackets
         * 
         */
        BracketNumbers ans = new BracketNumbers();
        String s = "(aa(bdc))p(dee)";
        System.out.println(ans.bracketNumbers(s));

    }
}
