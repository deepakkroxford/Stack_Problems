class FindCelibrity {
    public int celebrity(int mat[][]) {

        int ind = 1;
        for (int i = 0; i < mat.length; i++) {
            int currentcount = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    break;
                }
                currentcount++;
            }
            if (currentcount == mat[0].length) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            return -1;
        }
        for (int i = 0; i < mat.length; i++) {
            if (i != ind && mat[i][ind] == 0) {
                return -1;
            }
        }

        return ind;
    }

    // public int Celebrity2(int mat[][])
    // {
    //     for(int i=0;i<mat.length;i++){
    //         int sum=0;
    //         int col=0;
    //         for(int j=0;j<mat.length;j++){
    //             sum+=mat[i][j];
    //             col+=mat[j][i];
    //         }
    //         if(col==mat.length-1 && sum==0)
    //             return i;
    //     }
    //     return -1;
            
    // }
}

public class Q25_CelibrityProblem {
    public static void main(String[] args) {
        /* https://www.geeksforgeeks.org/problems/the-celebrity-problem/1
         * A celebrity is a person who is known to all but does not know anyone at a
         * party. A party is being organized by some people. A square matrix mat is used
         * to represent people at the party such that if an element of row i and column
         * j is set to 1 it means ith person knows jth person. You need to return the
         * index of the celebrity in the party, if the celebrity does not exist, return
         * -1.
         * 
         * Note: Follow 0-based indexing.
         * 
         * Examples:
         * 
         * Input: mat[][] = [[0 1 0],
         * [0 0 0],
         * [0 1 0]]
         * Output: 1
         * Explanation: 0th and 2nd person both know 1. Therefore, 1 is the celebrity.
         * Input: mat[][] = [[0 1],
         * [1 0]]
         * Output: -1
         * Explanation: The two people at the party both know each other. None of them
         * is a celebrity.
         * Expected Time Complexity: O(n2)
         * Expected Auxiliary Space: O(1)
         * 
         * Constraints:
         * 1 <= mat.size()<= 3000
         * 0 <= mat[i][j]<= 1
         */

         FindCelibrity findCelibrity = new FindCelibrity();

         // Test case 1
         int[][] mat1 = {
             {0, 1, 0},
             {0, 0, 0},
             {0, 1, 0}
         };
         System.out.println("Celebrity index: " + findCelibrity.celebrity(mat1)); // Expected output: 1
 
         // Test case 2
         int[][] mat2 = {
             {0, 1},
             {1, 0}
         };
         System.out.println("Celebrity index: " + findCelibrity.celebrity(mat2)); // Expected output: -1
 
         // Test case 3
         int[][] mat3 = {
             {0, 0, 1, 0},
             {0, 0, 1, 0},
             {0, 0, 0, 0},
             {0, 0, 1, 0}
         };
         System.out.println("Celebrity index: " + findCelibrity.celebrity(mat3)); // Expected output: 2

         int [][] mat4={
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {1, 0, 0, 0}
        };
        System.out.println("Celebrity index: " + findCelibrity.celebrity(mat4));
        //System.out.println("Celebrity index: " + findCelibrity.Celebrity2(mat4));
    }
}
