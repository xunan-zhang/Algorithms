package zxa;

public class RemoveNodeFromDoubleLinkList {
	
	static class Node<T> {
		T 		data;
		Node	prev, next;
		
		Node(T data) {
			this.data = data;
		}
	}
	
	static Node removeNode(Node head, Node node) 
	{
		Node curr = head;
		
		while (curr != node) {
			curr = curr.next;
		}
		
		if (curr.next == null) {		// last node
			curr.prev.next = null;
		} else if (curr.prev == null) {	// first node
			curr.next.prev = null;
			head = curr.next;
		} else {
			curr.prev.next = curr.next;
			curr.next.prev = curr.prev;
		}
		
		return head;
	}
	
	public static void main(String []argv) {
		Node <Integer>node1 = new Node<Integer>(1);
		Node <Integer>node2 = new Node<Integer>(2);
		Node <Integer>node3 = new Node<Integer>(3);
		Node <Integer>node4 = new Node<Integer>(4);
		Node <Integer>node5 = new Node<Integer>(5);
		Node <Integer>node6 = new Node<Integer>(6);
		Node <Integer>node7 = new Node<Integer>(7);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;

		node1.prev = null;
		node2.prev = node1;
		node3.prev = node2;
		node4.prev = node3;
		node5.prev = node4;
		node6.prev = node5;
		node7.prev = node6;
		
		
		
		Node node = removeNode(node1, node6);
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
		
	}

}
