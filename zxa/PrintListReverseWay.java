package zxa;

import zxa.FindMiddleElementOfList.Node;

public class PrintListReverseWay {
	static class Node<T> {
		T		value;
		Node 	next;
		
		Node(T s) {
			value = s;
		}
	}

	static void printListReverseWay(Node head) 
	{
		if (head == null) return;
		
		printListReverseWay(head.next);
		System.out.println(head.value);
		
	}
	
	public static void main(String []argv)
	{
		Node<String> node1 = new Node<String>("1");
		Node<String> node2 = new Node<String>("2");
		Node<String> node3 = new Node<String>("3");
		Node<String> node4 = new Node<String>("4");
		Node<String> node5 = new Node<String>("5");
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		
		printListReverseWay(node1);
	}
		
}
