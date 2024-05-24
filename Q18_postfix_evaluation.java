import java.util.Stack;

class postfix {
    public int eval(String s) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                st.push(ascii - 48);
            } else {
                if (ch == '+') {
                    int val2 = st.pop();
                    int val1 = st.pop();
                    st.push(val1 + val2);
                }
                if (ch == '-') {
                    int val2 = st.pop();
                    int val1 = st.pop();
                    st.push(val1 - val2);
                }
                if (ch == '*') {
                    int val2 = st.pop();
                    int val1 = st.pop();
                    st.push(val1 * val2);
                }
                if (ch == '/') {
                    int val2 = st.pop();
                    int val1 = st.pop();
                    st.push(val1 / val2);
                }

            }
        }
        return st.peek();
    }

}

public class Q18_postfix_evaluation {
    public static void main(String[] args) {
        postfix ans = new postfix();
        String s = "6523+8*+3+*"; // 6523+8*+3+* 953+4*6/-
        System.out.println(ans.eval(s));
    }
}
