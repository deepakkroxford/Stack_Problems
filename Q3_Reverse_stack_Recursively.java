import java.util.Stack;

public class Q3_Reverse_stack_Recursively {
    public static void displayereversedst(Stack<Integer>st)
    {
            if(st.size()==0)
            {
                return;
            }
            int top = st.pop();
            System.out.print(top+" ");
            displayereversedst(st);
            st.push(top);    
    }

    public static void displayst(Stack<Integer>st)
    {
            if(st.size()==0)
            {
                return;
            }
            int top = st.pop();
            
            displayst(st);
            System.out.print(top+" ");
            st.push(top);
            
    }
    public static void main(String[] args) {
        
        Stack<Integer> ans = new Stack<>();
        ans.push(1);
        ans.push(2);
        ans.push(3);
        ans.push(4);
        ans.push(5);
        System.out.println(ans);
        displayereversedst(ans);
        System.out.println();
        displayst(ans);
    }
}
