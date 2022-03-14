public class LinkedList {
    Node head;

    public static LinkedList insert(LinkedList linkedList, int data){
        Node node = new Node(data);
        node.next = null;
        if(linkedList.head == null){
            linkedList.head = node;
            return linkedList;
        }else {
            Node last = linkedList.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = node;
        }
        return linkedList;
    }

    public static void traverse(LinkedList linkedList) {
        if(linkedList == null){
            System.out.println("No Data");
        }else {
            System.out.print(" \nLinked List Traverse: ");
            while (linkedList.head.next != null){
                System.out.print(" "+linkedList.head.data);
                linkedList.head = linkedList.head.next;
            }
            System.out.print(" "+linkedList.head.data);
        }
    }

    public static Node addTwoNumberLinkedList(Node head1, Node head2){

        Node start1 = reverseLinkedList(head1);
        Node start2 = reverseLinkedList(head2);
        traverseNode(start1);
        traverseNode(start2);

        Node node = new Node(0);
        Node ans = node;
        int carry =0;
        while (start1!=null || start2 != null){
            int a = (start1 == null ? 0 : start1.data);
            int b = (start2 == null ? 0 : start2.data);

            carry = (carry+a+b)/10;

            node.next = new Node((a+b)%10);

            if(start1 != null)
                start1 = start1.next;
            if(start2 != null)
                start2 = start2.next;

            node = node.next;

        }
        if(carry > 0){
            node.next = new Node(carry);
        }
        return reverseLinkedList(ans.next);
    }

    static void traverseNode(Node node) {
        System.out.println("\nnumber");
        while (node != null){
            System.out.print(node.data);
            node = node.next;
        }
    }

    private static Node reverseLinkedList(Node node) {
        Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
}
