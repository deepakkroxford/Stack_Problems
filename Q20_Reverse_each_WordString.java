import java.util.Stack;

class reverseEachWord {
    String reverseWords(String s) {
        // your code here
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == '.') {
                while (!st.isEmpty()) {
                    sb.append(st.pop());

                }
                sb.append(".");
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();

    }
}
public class Q20_Reverse_each_WordString {
    public static void main(String[] args) {
        /*
         * Gfg
         * Given a String. Reverse each word in it where the words are separated by
         * dots.
         * 
         * Example 1:
         * 
         * Input:
         * S = "i.like.this.program.very.much"
         * Output:
         * i.ekil.siht.margorp.yrev.hcum
         * Explanation:
         * The words are reversed as
         * follows:"i" -> "i","like"->"ekil",
         * "this"->"siht","program" -> "margorp",
         * "very" -> "yrev","much" -> "hcum".
         * Example 2:
         * 
         * Input:
         * S = "pqr.mno"
         * Output:
         * rqp.onm
         * Explanation:
         * The words are reversed as
         * follows:"pqr" -> "rqp" ,
         * "mno" -> "onm"
         * 
         * Your Task:
         * You don't need to read input or print anything. Your task is to complete the
         * functionreverseWords()which takes the string S as input and returns the
         * resultant string by reversing all the words separated by dots.
         * 
         * 
         * Expected Time Complexity:O(|S|).
         * Expected Auxiliary Space:O(|S|).
         * 
         * 
         * Constraints:
         * 1<=|S|<=105
         */
        reverseEachWord ans = new reverseEachWord();
        String s = "i.like.this.program.very.much";
        System.out.println("the reverse of each word is --> " + ans.reverseWords(s));

    }
}
