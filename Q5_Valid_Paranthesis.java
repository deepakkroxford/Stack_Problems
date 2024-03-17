import java.util.Stack;

class Valid_Paranthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(st.isEmpty() || ch=='(' || ch =='{' || ch=='[')
            {
                st.push(ch);
                
            }

            if(ch==')')
            {
                if(st.peek()=='(')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
           else if(ch=='}')
            {
                if(st.peek()=='{')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
           else if(ch==']')
            {
                if(st.peek()=='[')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }

        }
        return st.isEmpty();
    }
}

//"{[()]}";

public class Q5_Valid_Paranthesis {
    public static void main(String[] args) {
        Valid_Paranthesis ans = new Valid_Paranthesis();
        String input="(())(){[(())]}";
        System.out.println("Input: "+input);
        boolean output=ans.isValid(input);
        System.out.println("Output:   "+output);
    }
}
