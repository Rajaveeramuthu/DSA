// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class reverseList {
//     // Function to reverse the linked list
//     public static Node reverse(Node head) {
//         Node prev = null;
//         Node current = head;

//         while (current != null) {
//             Node nextNode = current.next;
//             current.next = prev;
//             prev = current;
//             current = nextNode;
//         }

//         return prev;
//     }

//     // Function to print the linked list
//     public static void printList(Node head) {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         // Creating a simple linked list: 10 -> 20 -> 30 -> 40 -> null
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = new Node(40);

//         System.out.println("Original Linked List:");
//         printList(head);

//         head = reverse(head); // Reversing the list

//         System.out.println("Reversed Linked List:");
//         printList(head);
//     }
// }

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class reverseList {
    
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

   
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = scanner.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Original Linked List:");
        printList(head);

        head = reverse(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}

