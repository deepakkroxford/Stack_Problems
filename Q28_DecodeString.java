
import java.util.Stack;
public class Q28_DecodeString {

    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> ch = new Stack<>();
        StringBuilder sb = new StringBuilder();


        int x=0;
        for(int i=0;i<s.length();i++) {
            
            if(Character.isDigit(s.charAt(i))){
                char temp = s.charAt(i);  // Keep temp as a char
                 x = Character.getNumericValue(temp);  // Convert the char to an integer
                 continue;  
            }
            else if(s.charAt(i)=='['){
                st.push(x);
                ch.push(sb);
                sb = new StringBuilder(); // reset the sting builder
                x=0; // reset the x value 

            }
            else if (s.charAt(i)==']'){
                int repeat = st.pop();
                StringBuilder temp = new StringBuilder();
                for (int j = 0; j < repeat; j++) {
                    temp.append(sb);
                }
                // Combine with the previous string context
                sb = ch.pop().append(temp);
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();


    }
    public static void main(String[] args) {
        /*
         * Leetcode :- 394 https://leetcode.com/problems/decode-string/description/
         * Given an encoded string, return its decoded string.
         * 
         * The encoding rule is: k[encoded_string], where the encoded_string inside the
         * square brackets is being repeated exactly k times. Note that k is guaranteed
         * to be a positive integer.
         * 
         * You may assume that the input string is always valid; there are no extra
         * white spaces, square brackets are well-formed, etc. Furthermore, you may
         * assume that the original data does not contain any digits and that digits are
         * only for those repeat numbers, k. For example, there will not be input like
         * 3a or 2[4].
         * 
         * The test cases are generated so that the length of the output will never
         * exceed 105.
         *    
         * Example 1:
         * 
         * Input: s = "3[a]2[bc]"
         * Output: "aaabcbc"
         * Example 2:
         * 
         * Input: s = "3[a2[c]]"
         * Output: "accaccacc"
         * Example 3:
         * 
         * Input: s = "2[abc]3[cd]ef"
         * Output: "abcabccdcdcdef"
         * 
         * 
         * Constraints:
         * 
         * 1 <= s.length <= 30
         * s consists of lowercase English letters, digits, and square brackets '[]'.
         * s is guaranteed to be a valid input.
         * All the integers in s are in the range [1, 300].
         * Accepted
         * 917.8K
         * Submissions
         * 1.5M
         * Acceptance Rate
         * 60.3%
         */

         Q28_DecodeString obj = new Q28_DecodeString();
         System.out.println(obj.decodeString("3[a]2[bc]")); // Expected Output: "aaabcbc"
         System.out.println(obj.decodeString("2[abc]3[cd]ef")); // Expected Output: " 
    }
}
