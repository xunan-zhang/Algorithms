/**
 * 
 */
package zxa;

/**
 * @author carl.zhang
 * Dec 28, 2017 8:41:09 PM
 */
class Node<T> {
	T  value;
	Node 	next;
	
	Node(T s, Node node) {
		value = s;
		this.next = node;
	}
}

public class FindMiddleElementOfList<T> {
	
	static class Node<T> {
		T		value;
		Node 	next;
		
		Node(T s) {
			value = s;
		}
	}

	Node<T> findMiddleElement(Node<T> head) {
		Node<T> mid = head;
		int i = 1;
		
		while (head.next != null) {
			if (i++%2 == 0) {
				mid = mid.next;
			}
			head = head.next;
		}
		return mid;
	}
	
	public static void main(String []argv)
	{
		Node<String> node1 = new Node<String>("1");
		Node<String> node2 = new Node<String>("2");
		Node<String> node3 = new Node<String>("3");
		Node<String> node4 = new Node<String>("4");
		Node<String> node5 = new Node<String>("5");
		Node<String> node6 = new Node<String>("6");
		Node<String> node7 = new Node<String>("7");
		Node<String> node8 = new Node<String>("8");
		Node<String> node9 = new Node<String>("9");
		Node<String> node10 = new Node<String>("10");
		Node<String> node11 = new Node<String>("11");
		Node<String> node12 = new Node<String>("12");
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		node10.next = node11;
		node11.next = node12;
		node12.next = null;
		
		Node node = new FindMiddleElementOfList().findMiddleElement(node1);
		
		System.out.println(node.value);
	}
}
