
// class Node{
//     int data;
//     Node next;
//     Node(int a){
//         data=a;
//         next=null;
//     }
// }
// class linkedlist{
//     Node head;
//     Node  current;
//     void add(int a){
//         Node newnode= new Node(a);
       
//         if(head==null){
//             head=newnode;
//             current=newnode;
//         }
//         else{
//                 current.next=newnode;
//             current=newnode;
//         }
//     }
//     void print(){
//         Node current=head;
//         while(current!=null){
//             System.out.println(current.data+" ");
//             current=current.next;
//         }
        
//     }
//     void delete(int a){
        
//     }
// }
// class node{
//     public static void main(String args[]){
//         linkedlist list=new linkedlist();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.print();
        
//     }
// }



import java.util.*;

class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}

class LinkedListDemo {
    Node head;
    Node current;

    void add(int a) {
        Node newnode = new Node(a);

        if (head == null) {
            head = newnode;
            current = newnode;
        } else {
            current.next = newnode;
            current = newnode;
        }
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void delete(int a) {
        if (head == null) return;

        if (head.data == a) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != a) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
}

public class node {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedListDemo list = new LinkedListDemo();

        int d = sc.nextInt(); // Number of elements to add
        for (int i = 0; i < d; i++) {
            list.add(sc.nextInt());
        }

        list.print();

        System.out.print("Enter element to delete: ");
        int del = sc.nextInt();
        list.delete(del);

        System.out.println("After deletion:");
        list.print();
    }
}
