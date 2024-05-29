import java.util.Stack;

class Get_Min_pop{
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack <Integer> st =new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                st.push(arr[i]);
            }
            else 
            {
               if(st.peek()<arr[i])
               {
                   st.push(st.peek());
               }
               else
               {
                   st.push(arr[i]);
               }
            }
        }
        return st;
    }
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        while(!s.isEmpty())
        {
           System.out.print(" "+s.pop());
        }
    }
}


public class Q21_Get_Min_pop {
    public static void main(String[] args) {
        int arr[] = {1, 34, 23, 17, 37, 42, 13, 39, 0, 53, 49, 6, 71};
        int n = arr.length;
        
        Stack<Integer> st = Get_Min_pop._push(arr, n);
        System.out.println("Minimum at each pop:");
        Get_Min_pop._getMinAtPop(st);

    }
}
