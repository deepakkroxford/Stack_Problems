import java.util.Stack;
class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.isEmpty() || ch != '#') {
                st.push(ch);
            }
            if (ch == '#' && !st.isEmpty()) {
                st.pop();
            }
        }
        Stack<Character> st1 = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (st1.isEmpty() || ch != '#') {
                st1.push(ch);
            }
            if (ch == '#' && !st1.isEmpty()) {
                st1.pop();
            }

        }
        if (st.equals(st1)) { //this equal to function is used to compare the element of the stack 
            return true;
        }
        return false;
    }

}

public class Q6_Backspace_String_Compare {
    public static void main(String[] args) {
        /*
         * leetcode=844
         * 
         * Given two strings s and t, return true if they are equal when both are typed
         * into empty text editors. '#' means a backspace character.
         * 
         * Note that after backspacing an empty text, the text will continue empty.
         * 
         * Example 1:
         * 
         * Input: s = "ab#c", t = "ad#c"
         * Output: true
         * Explanation: Both s and t become "ac".
         * 
         * Example 2:
         * Input: s = "ab##", t = "c#d#"
         * Output: true
         * Explanation: Both s and t become "".
         * 
         * Example 3:
         * Input: s = "a#c", t = "b"
         * Output: false
         * Explanation: s becomes "c" while t becomes "b".
         * 
         * 
         * Constraints:
         * 
         * 1 <= s.length, t.length <= 200
         * s and t only contain lowercase letters and '#' characters.
         * 
         */
        BackspaceStringCompare ans = new BackspaceStringCompare();
        String s = "ab#c"; 
        String x =  "ad#c";
        System.out.println("Are \""+s+"\" and \""+x+"\" equal? "+ans.backspaceCompare(s,x));
    }
}
