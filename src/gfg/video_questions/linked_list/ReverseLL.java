package gfg.video_questions.linked_list;

import java.util.ArrayList;

public class ReverseLL {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;

        // Reverse a LL
        //Node reverseNode = reverseLL(head);

        Node reverseNodeOptimized = reverseLLOptimized(head);
        //traverseLLRecursive(reverseNode);
        traverseLLRecursive(reverseNodeOptimized);
    }

    static Node reverseLLOptimized(Node head){
        Node curr = head;
        Node prev  = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node reverseLL(Node head){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (Node curr = head; curr != null; curr = curr.next)
            arr.add(curr.data);
        for (Node curr = head; curr != null; curr = curr.next)
            curr.data = arr.remove(arr.size() - 1);

        return head;
    }
    static void traverseLLRecursive(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " -> ");
        traverseLLRecursive(head.next);
    }
}
