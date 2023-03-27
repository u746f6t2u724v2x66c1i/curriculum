import java.util.Arrays;
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Stack {
    Node top;

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
    }
}
