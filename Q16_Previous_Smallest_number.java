import java.util.Stack;

;

/**
 * Q16_Smallest_number_on_left
 */
public class Q16_Previous_Smallest_number {

    public static void main(String[] args) {
        int arr[]={1, 6, 4, 10, 2, 5};
        Stack <Integer> st = new Stack<>();
        int res[]= new int[arr.length];
        // st.push(arr[arr.length-1]);

        for(int i=0;i<arr.length;i++){
        while(!st.empty() && st.peek()>=arr[i])
        {
        st.pop();
        }
        
        if(st.isEmpty())
        {
        res[i]=-1;
        }
        else
        {
        res[i]=st.peek();
        }
        st.push(arr[i]);
    }

    for (int i : res) {
        System.out.println(i);
    }
        
    }
}