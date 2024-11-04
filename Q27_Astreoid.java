
import java.util.Arrays;
import java.util.Stack;

class Asteroids {
    public int[] collide(int arr[]) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                st.push(arr[i]);
            } else {

                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(arr[i])) {
                    st.pop(); // Pop smaller right-moving asteroids
                }

                if (st.isEmpty() || st.peek() < 0) {
                    st.push(arr[i]);
                } else if (st.peek() == Math.abs(arr[i])) {
                    st.pop();
                }

            }
        }

        int ans[] = new int[st.size()];
        for (int j = st.size() - 1; j >= 0; j--) {
            ans[j] = st.pop();
        }

        return ans;

    }
}

public class Q27_Astreoid {

    public static void main(String[] args) {
        /*
         * Leetcode ->735 https://leetcode.com/problems/asteroid-collision/description/
         * We are given an array asteroids of integers representing asteroids in a row.
         * 
         * For each asteroid, the absolute value represents its size, and the sign
         * represents its direction (positive meaning right, negative meaning left).
         * Each asteroid moves at the same speed.
         * 
         * Find out the state of the asteroids after all collisions. If two asteroids
         * meet, the smaller one will explode. If both are the same size, both will
         * explode. Two asteroids moving in the same direction will never meet.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: asteroids = [5,10,-5]
         * Output: [5,10]
         * Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never
         * collide.
         * Example 2:
         * 
         * Input: asteroids = [8,-8]
         * Output: []
         * Explanation: The 8 and -8 collide exploding each other.
         * Example 3:
         * 
         * Input: asteroids = [10,2,-5]
         * Output: [10]
         * Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide
         * resulting in 10.
         * 
         * 
         * Constraints:
         * 
         * 2 <= asteroids.length <= 104
         * -1000 <= asteroids[i] <= 1000
         * asteroids[i] != 0
         */
        Asteroids asteroidSimulator = new Asteroids();

        int[] arr1 = { 8, -8, 12 };
        System.out.println("Asteroids: " + Arrays.toString(arr1));
        System.out.println("Collision Result: " + Arrays.toString(asteroidSimulator.collide(arr1)));
        System.out.println();

        int[] arr2 = { -2, -1, 1, 2 };
        System.out.println("Asteroids: " + Arrays.toString(arr2));
        System.out.println("Collision Result: " + Arrays.toString(asteroidSimulator.collide(arr2)));
        System.out.println();

        int[] arr3 = { 8, -8 };
        System.out.println("Asteroids: " + Arrays.toString(arr3));
        System.out.println("Collision Result: " + Arrays.toString(asteroidSimulator.collide(arr3)));
        System.out.println();

    }
}
