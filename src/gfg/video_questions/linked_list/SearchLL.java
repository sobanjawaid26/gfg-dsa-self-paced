package gfg.video_questions.linked_list;

public class SearchLL {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;

        // Search a LL
        int pos = searchLL(head, 30);
        int pos2 = searchLLRecursive(head, 20);
        System.out.println(pos);
        System.out.println(pos2);
    }

    static int searchLLRecursive(Node head, int ele){
        if(head == null)
            return -1;
        if(head.data == ele)
            return 1;
        else{
            int res = searchLLRecursive(head.next, ele);
            if(res == -1)
                return -1;
            else
                return (res + 1);
        }

    }
    static int searchLL(Node head, int ele){
        Node curr = head;
        int pos = 1;
        while(curr != null) {
            if (ele == curr.data)
                return pos;
            curr = curr.next;
            pos++;
        }
        return -1;
    }

    static void traverseLLRecursive(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " -> ");
        traverseLLRecursive(head.next);
    }
}
