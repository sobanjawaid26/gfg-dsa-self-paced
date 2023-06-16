package gfg.video_questions.linked_list;

public class LinkedListImpl {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        printLL(head);
    }

    static Node createLL(){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        return head;
    }

    static void printLL(Node head){
        while(head.next != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
    }
}

class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
