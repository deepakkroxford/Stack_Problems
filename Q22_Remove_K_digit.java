import java.util.Stack;

public class Q22_Remove_K_digit {
    class Solution {
        public String removeKdigits(String s, int k) {
            // code here
           Stack<Character> st = new Stack<>();
           for(int i=0;i<s.length();i++)
           {
               char ch = s.charAt(i);
               while(!st.isEmpty() && st.peek()>ch && k>0)
               {
                   st.pop();
                   k--;
               }
               
               if(!st.isEmpty() || ch!='0')
               {
                   st.push(ch);
               }
           }
           
           //if all the element are in the incresing order so in this case we have to remove form stack at least k elemtn
           while(!st.isEmpty() && k>0)
           {
               st.pop();
               k--;
           }
           
           StringBuilder sb = new StringBuilder();
           while(!st.isEmpty())
           {
               sb.append(st.pop());
           }
           String a = sb.reverse().toString();
            
            // Edge case: if all digits are removed, return "0"
            if (a.length()==0) {
                return "0";
            }
            return a;
        }
    }
    public static void main(String[] args) {
        /*
         * Given a non-negative integer S represented as a string, remove K digits from
         * the number so that the new number is the smallest possible.
         * Note : The given num does not contain any leading zero.
         * 
         * Example 1:
         * 
         * Input:
         * S = "149811", K = 3
         * Output:
         * 111
         * Explanation:
         * Remove the three digits
         * 4, 9, and 8 to form the new number 111
         * which is smallest.
         * Example 2:
         * 
         * Input:
         * S = "1002991", K = 3
         * Output:
         * 21
         * Explanation:
         * Remove the three digits 1(leading
         * one), 9, and 9 to form the new number 21(Note
         * that the output must not contain leading
         * zeroes) which is the smallest.
         * Your Task:
         * You don't need to read input or print anything. Your task is to complete the
         * function removeKdigits() which takes the string S and an integer K as input
         * and returns the new number which is the smallest possible.
         * 
         * Expected Time Complexity: O(|S|).
         * Expected Auxiliary Space: O(|S|).
         * 
         * Constraints:
         * 1<= K <= |S|<=106
         */

         Q22_Remove_K_digit outer = new Q22_Remove_K_digit();
         Solution ans = outer.new Solution();
         
         // Test case 1
         String s1 = "149811";
         int k1 = 3;
         System.out.println("Input: S = " + s1 + ", K = " + k1);
         System.out.println("Output: " + ans.removeKdigits(s1, k1));
         
         // Test case 2
         String s2 = "10200";
         int k2 = 1;
         System.out.println("Input: S = " + s2 + ", K = " + k2);
         System.out.println("Output: " + ans.removeKdigits(s2, k2));
         String s3 = "10";
         int k3 = 1;
         System.out.println("Input: S = " + s3 + ", K = " + k3);
         System.out.println("Output: " + ans.removeKdigits(s3, k3));

    }

}
