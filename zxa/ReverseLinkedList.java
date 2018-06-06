/**
 * 
 */
package zxa;

public class ReverseLinkedList 
{
	protected int ii;
	
	ReverseLinkedList()
	{
		ii = 888;
	}
	static class Node <T> {
		T 		data;
		Node 	<T>next;
		
		Node(T data) {
			this.data = data;
		}
	}

	public static void main(String []argv) {
		// creating a singly linked list 
		Node <String>head = new Node<String>("0");
		Node <String>node1 = new Node <String>("1");
		Node <String> node2 = new Node <String>("2");
		Node <String>node3 = new Node <String>("3");
		Node <String>node4 = new Node <String>("4");
		Node <String>node5 = new Node <String>("5");
		Node <String>node6 = new Node <String>("6");
		Node <String>node7 = new Node <String>("7");
		Node <String>node8 = new Node <String>("8");
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = null;

		ReverseLinkedList list = new ReverseLinkedList();
		Node <String>node = head;
//		while (node != null) {
//			System.out.println(node.data);
//			node = node.next;
//		}
		
//		head = list.reverseLinkedList(head);
//		node = head;
//		while (node != null) {
//			System.out.println(node.data);
//			node = node.next;
//		}
		
//		head =list.recursiveReverse(head);
//		node = head;
//		while (node != null) {
//			System.out.println(node.data);
//			node = node.next;
//		}
		
		head =list.recursiveReverse(head);
		node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	Node recursiveReverse(Node first) 
	{
		  // if head is null or only one node, it's reverse of itself.
		  if ((first == null) || (first.next == null) ) 
			  return first;

		  // Divide the list in 2 parts: first & rest -- reverse the rest part
		  Node rest_reserved = recursiveReverse(first.next);

		  // first.next still points to the last element of rest part.
		  // so move the head to end.
		  first.next.next = first;

		  // point last node to nil, (get rid of cycles)
		  first.next = null;
		  return rest_reserved;
	}    

	//non-recursive reverse
	Node reverseLinkedList(Node<String> head) {
		Node<String> prev = head;
		Node<String> curr = null;
		
		while (head != null) {
			prev = head.next;
			head.next = curr;
			curr = head;
			head = prev;			
		}
		
		return curr;
	}
	
}
