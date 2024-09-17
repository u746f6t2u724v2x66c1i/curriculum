import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListInsertion {
    // Function to insert a new node at the end of the linked list
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // If the list is empty, the new node becomes the head
            head = newNode;
        } else {
            // Traverse to the end of the list and add the new node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        return head;
    }

    public static void main(String[] args) {
        // Reading input from the terminal
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();

        int[] elements = new int[T];
        for (int i = 0; i < T; i++) {
            elements[i] = scanner.nextInt();
        }

        // Initializing the linked list
        Node head = null;

        // Inserting elements into the linked list
        for (int i = 0; i < T; i++) {
            head = insert(head, elements[i]);
        }

        // Printing the linked list
        printLinkedList(head);

        // Close the scanner
        scanner.close();
    }

    // Function to print the linked list
    static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    System.out.println();
    }
}
