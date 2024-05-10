import java.util.Stack;
import java.util.Vector;

/**
 * Q12_String_Manipulation
 */
class StringMAnupulation {

    int removeConsecutiveSame(Vector<String> v) {
        // Your code goes here
        Stack<String> st = new Stack<>();

        for (int i = 0; i < v.size(); i++) {
            if (st.isEmpty()) {
                st.push(v.get(i));
            } else if (st.peek().equals(v.get(i))) {
                st.pop();
            } else {
                st.push(v.get(i));
            }

        }
        return st.size();
    }
}

public class Q12_String_Manipulation {

    public static void main(String[] args) {
        /*
         * Tom is a string freak. He has got sequences of n words to manipulate. If in a
         * sequence, two same words come together then hell destroy each other. He wants
         * to know the number of words left in the sequence after this pairwise
         * destruction.
         * 
         * 
         * Example 1:
         * 
         * Input:
         * 5
         * v[] = {"ab", "aa", "aa", "bcd", "ab"}
         * Output:
         * 3
         * Explanation:
         * ab aa aa bcd ab
         * After the first iteration, we'll have: ab bcd ab
         * We can't further destroy more strings and
         * hence we stop and the result is 3.
         * 
         * 
         * Example 2:
         * 
         * Input:
         * 4
         * v[] = {"tom", "jerry", "jerry", "tom"}
         * Output:
         * 0
         * Explanation:
         * tom jerry jerry tom
         * After the first iteration, we'll have: tom tom
         * After the second iteration: 'empty-array'
         * Hence, the result is 0.
         * 
         * 
         * 
         * Your Task:
         * You don't need to read input or print anything. Your task is to complete the
         * function removeConsecutiveSame() which takes the array A[] and its size N as
         * inputs and returns the number of words left per sequence.
         * 
         * 
         * 
         * Expected Time Complexity: O(N)
         * Expected Auxiliary Space: O(N)
         * 
         */

        StringMAnupulation ans = new StringMAnupulation();
        // Example vector
        Vector<String> vector = new Vector<>();
        vector.add("ab");
        vector.add("aa");
        vector.add("aa");
        vector.add("bcd");
        vector.add("ab");

        // Call the removeConsecutiveSame method
        int result = ans.removeConsecutiveSame(vector);

        // Output the result
        System.out.println("Number of remaining elements after removing consecutive duplicates: " + result);
    }

}
