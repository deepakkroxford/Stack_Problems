class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;

    }
}
class Stack {
    Node head = null;
    int size = 0;

    public void push(int x) {
        Node temp = new Node(x);
        if (head == null) {
            head = temp;

        } else {
            temp.next = head;
            head = temp;
        }
        size++; 
    }

    public void pop() {
        Node temp = head;
        if (head == null) {
            System.out.println("stack is Already empty ");
            return;
        } else {
            head = head.next;
            temp = null;
            size--;
        }
    }

    public void peek() {
        if (head == null) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("the peak element is " + head.data);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

}

public class Q24_StackLinklist_Implementation {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Example 1: Pushing elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Example 2: Peeking the top element
        stack.peek(); // Should print "the peak element is 30"

        // Example 3: Checking the size of the stack
        System.out.println("Stack size is: " + stack.size()); // Should print "Stack size is: 3"

        // Example 4: Popping elements from the stack
        stack.pop();
        stack.peek(); // Should print "the peak element is 20"

        // Example 5: Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print "Is stack empty? false"

        // Example 6: Popping remaining elements
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack, should print "stack is Already empty"

        // Example 7: Peeking on an empty stack
        stack.peek(); // Should print "stack is empty"
    }
}
