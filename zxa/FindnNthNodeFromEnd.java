package zxa;

import java.util.Stack;

import zxa.PrintListReverseWay.Node;

public class FindnNthNodeFromEnd {
	static class Node<T> {
		T		value;
		Node 	next;
		
		Node(T s) {
			value = s;
		}
	}

	static Node findnNthNodeFromEnd(Node head, int n) 
	{
		Stack<Node> stack = new Stack<Node>();
		
		while (head != null) {
			stack.push(head);
			head = head.next;
		}
		
		if (stack.isEmpty()) return null;
		
		Node node = null;
		int i = 0;
		while (i < n && !stack.isEmpty()) {
			node = stack.pop();
			i++;
		}

		return ((i == n) ? node : null);
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
		
		Node node = findnNthNodeFromEnd(node1,5);
		
		if (node != null)
			System.out.println(node.value);
	}
		
}
