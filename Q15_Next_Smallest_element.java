import java.util.Stack;

/**
 * InnerQ15_Next_Smallest_element
 */
 class Next_Smallest_element {
     public int [] nextsmallerOn2(int arr[])
    {
       
        int res[] = new int [arr.length];
        res[arr.length-1]=-1;
        for(int i=0;i<arr.length-1;i++)
        {
            res[i]=-1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    res[i]=arr[j];
                    break;
                }
            }
        }
        return res;

    }
    public int [] nextsmallerOn(int arr[])
    {
        int res[] = new int [arr.length];
        res[arr.length-1]=-1;
        Stack<Integer> st = new Stack<>();

        return res;

    }

    
}



public class Q15_Next_Smallest_element {
    public static void main(String[] args) {
        Next_Smallest_element ans = new Next_Smallest_element();
        int arr[] = {7, 9, 12, 10, 14, 8, 3, 6, 9};
        int result[] = ans.nextsmallerOn2(arr);
        for (int i : result) {
            System.out.println(i);
        }
       
    }

   
}