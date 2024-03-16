public class Q4_Array_Implementation_stack {
    public static class Stack {
        int arr[] = new int[5]; // declaring an array of size 5 for the stack
        int idx = 0;

        void push(int x) {

            if(isFull())
            {
                System.out.println( "Stack is Full");
                return;
            }
            arr[idx]=x;
            idx++;
        }

        int pop() {
            if (isEmpty()) { // Check if the stack is empty
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx - 1]; //copying element in the top  variable
            arr[idx - 1] = 0; // the make that index value to 0
            idx--; // decreasing the index after removing the element.
            return top;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            if (idx == 0) {
                return true;
            } else {
                return false;
            }
        }

        boolean isFull() {
            if (idx == arr.length) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Stack ans = new Stack();
        ans.push(10);
        ans.push(20);
        ans.push(40);
        ans.push(120);
        ans.display();
        System.out.println("Size of the stack: " + ans.size());

        // Example of popping elements
        System.out.println("Popped element: " + ans.pop());
        System.out.println("Popped element: " + ans.pop());
        ans.display();
        System.out.println(ans.peek());
    }
}
