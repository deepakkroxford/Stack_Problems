import java.util.Stack;

class removeConsecutiveSubSequence
{
    public  int[] remove (int arr[])
    {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length-1;i++)
        {
            if(st.isEmpty() || st.peek() != arr[i])
            {
                st.push(arr[i]);
            }

            else if(arr[i]==st.peek())
            {
                if(i==arr.length-1 || arr[i]!=arr[i+1])
                {
                    st.pop();
                }
            }

        }
        int res[] = new int[st.size()];
        for(int i=res.length-1;i>=0;i--)
        {
            res[i]=st.pop();
        }
        return res;

           
    }
}

public class Q7_Remove_consecutive_Subsequence {
    public static void main(String[] args) {

        /*
         * give a sequence of the number .remove all the consecutive subsequence of the
         * length
         * greater then or equal to 2 tha contains the same element
         */
        removeConsecutiveSubSequence ans = new removeConsecutiveSubSequence();
        int arr[] = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7 };
        int result[] = ans.remove(arr);

        for(int i =0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
