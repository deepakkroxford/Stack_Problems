import java.util.Stack;

public class Q8_Next_Greater_element {
  public  void main(String[] args) {

    // time complexity is O(n^2), so it's not a good solution

    /*
     * int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };
     * int res[] = new int[arr.length];
     * for (int i = 0; i < arr.length; i++) {
     * res[i] = -1;
     * for (int j = i + 1; j < arr.length; j++) {
     * if (arr[i] < arr[j]) {
     * res[i] = arr[j];
     * break;
     * }
     * }
     * }
     * 
     * for (int i : res) {
     * System.out.println(i);
     * }
     */
       
    Stack<Integer> stack = new Stack();
    int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };
    int res[] = new int[arr.length];
    res[arr.length - 1] = -1;
    stack.push(arr[arr.length - 1]);

    for (int i = arr.length - 2; i >= 0; i--) {

      while (stack.size() > 0 && stack.peek() <= arr[i]) {
        stack.pop();
      }

      if (stack.size() == 0) {
        res[i] = -1;
      } else {
        res[i] = stack.peek();
      }
      stack.push(arr[i]);
    }

    for (int i = 0; i < res.length; i++) {
      System.out.println(res[i]);
    }

  }
}
