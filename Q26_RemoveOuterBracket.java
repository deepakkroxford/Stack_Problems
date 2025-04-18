import java.util.Stack;
class RemovePranthesis{
    public String removeOuterParentheses(String s) {
        /*
         * Fist approch using the stack
         */
        Stack <Character>st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== '(')
            {
                 if(st.size()>0)
                 {
                    sb.append(s.charAt(i));
                 }
                 st.push(s.charAt(i));
                
            }
            else {
                st.pop();
                if(st.size()>0)
                {
                    sb.append(s.charAt(i));
                }
             }
        }

        return sb.toString();
    }

    public String removeOuterUsingString(String s) { 
        int count=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
               if(count>0)
               {
                 sb.append(s.charAt(i));
               }
               count++;
            }
            else{
                count--;
                if(count>0)
                {
                    sb.append(s.charAt(i));
                }

            }
        }
        return sb.toString();
    }
}

public class Q26_RemoveOuterBracket {
    public static void main(String[] args) {
        /*
         * Lettccode- https://leetcode.com/problems/remove-outermost-parentheses/description/
         * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where
         * A and B are valid parentheses strings, and + represents string concatenation.
         * 
         * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses
         * strings.
         * A valid parentheses string s is primitive if it is nonempty, and there does
         * not exist a way to split it into s = A + B, with A and B nonempty valid
         * parentheses strings.
         * 
         * Given a valid parentheses string s, consider its primitive decomposition: s =
         * P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
         * 
         * Return s after removing the outermost parentheses of every primitive string
         * in the primitive decomposition of s.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: s = "(()())(())"
         * Output: "()()()"
         * Explanation:
         * The input string is "(()())(())", with primitive decomposition "(()())" +
         * "(())".
         * After removing outer parentheses of each part, this is "()()" + "()" =
         * "()()()".
         * Example 2:
         * 
         * Input: s = "(()())(())(()(()))"
         * Output: "()()()()(())"
         * Explanation:
         * The input string is "(()())(())(()(()))", with primitive decomposition
         * "(()())" + "(())" + "(()(()))".
         * After removing outer parentheses of each part, this is "()()" + "()" +
         * "()(())" = "()()()()(())".
         * Example 3:
         * 
         * Input: s = "()()"
         * Output: ""
         * Explanation:
         * The input string is "()()", with primitive decomposition "()" + "()".
         * After removing outer parentheses of each part, this is "" + "" = "".
         * 
         * 
         * Constraints:
         * 
         * 1 <= s.length <= 105
         * s[i] is either '(' or ')'.
         * s is a valid parentheses string.
         */

         RemovePranthesis ans = new RemovePranthesis();
         System.out.println(ans.removeOuterParentheses("(()())(())(()(()))"));

         System.out.println(ans.removeOuterUsingString("(()())(())(()(()))"));
    }
}
