import java.util.Scanner;
import java.util.Stack;

/**
 * Q14_Minimum_AddTo_makeValdi_Paranthesis
 */
class Minimum_AddTo_makeValdi_Paranthesis {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '}') {
                st.push(ch);
            } else if (st.isEmpty()) {
                count++;
            } else if ((st.peek() == '(' && ch == ')') || (st.peek() == '[' && ch == ']')
                    || (st.peek() == '{' && ch == '}')) {
                st.pop();
            } else {
                count++;
            }
        }
        return count + st.size();
    }
}

public class Q14_Minimum_AddTo_makeValdi_Paranthesis {
    public static void main(String[] args) {
        /*
         * leetcode -> 921
         * A parentheses string is valid if and only if:
         * 
         * It is the empty string,
         * It can be written as AB (A concatenated with B), where A and B are valid
         * strings, or
         * It can be written as (A), where A is a valid string.
         * You are given a parentheses string s. In one move, you can insert a
         * parenthesis at any position of the string.
         * 
         * For example, if s = "()))", you can insert an opening parenthesis to be
         * "(()))" or a closing parenthesis to be "())))".
         * Return the minimum number of moves required to make s valid.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: s = "())"
         * Output: 1
         * Example 2:
         * 
         * Input: s = "((("
         * Output: 3
         * 
         * 
         * Constraints:
         * 
         * 1 <= s.length <= 1000
         * s[i] is either '(' or ')'.
         * but the code what i writeen is work for all three type
         * of bracket like--> {},[],()
         * 
         */
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();

        Minimum_AddTo_makeValdi_Paranthesis ans = new Minimum_AddTo_makeValdi_Paranthesis();
        System.out.println(ans.minAddToMakeValid(s));
    }
}