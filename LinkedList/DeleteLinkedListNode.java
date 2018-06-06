package LinkedList;

public class DeleteLinkedListNode {
	static class Node {
	    int data;
	    Node next;

	    Node(int d) {
	        data = d;
	        next = null;
	    }
	}

    static Node deleteNode2(Node node, Node n) {

    	Node head = node;
    	
    	if (node == null)
    		return head;

    	Node pre = null;
    	while (node.next != null & node != n) {
    		pre = node;
    		node = node.next;
    	}
    	
    	// delete first node
    	if (pre == null) { 
    		if (head.next != null)
    			head = head.next;
    		else
    			head = null;
    	} else
	    	if (node == n) {
	       		pre.next = node.next;
	    	}
    	
    	return head;
    }
    /* Utility function to print a linked list */
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }
 
    public static void main(String[] args) {
    	Node list = new Node(12);
    	Node head = list;
    	list.next = new Node(15);
        list = list.next; 
    	list.next = new Node(10);
        list = list.next; 
    	list.next = new Node(11);
        list = list.next; 
    	list.next = new Node(5);
        list = list.next; 
    	list.next = new Node(6);
        list = list.next; 
    	list.next = new Node(2);
        list = list.next; 
    	list.next = new Node(3);
 
        System.out.println("Given Linked List :");
        printList(head);
        System.out.println("");
         
        // Let us delete the node with value first node
        System.out.println("Deleting node :" + head);
        Node newHead = deleteNode2(head, head);
        printList(newHead);
        
        // Let us delete the node with middle node
        newHead = deleteNode2(head, head.next.next);
        printList(newHead);

        // Let us delete the node with value last node
        newHead = deleteNode2(head, head.next.next.next.next.next.next);
        printList(newHead);
 
    }
}
 
// this code has been contributed by Mayank Jaiswal
