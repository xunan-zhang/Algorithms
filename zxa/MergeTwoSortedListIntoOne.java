package zxa;

import java.util.List;

import zxa.FindnNthNodeFromEnd.Node;

public class MergeTwoSortedListIntoOne {
	static class Node<T> {
		String value;
		Node next;

		Node() {
		};

		Node(String s) {
			value = s;
		}
	}

	static Node mergeSortedLists(Node node1, Node node2) {
		Node newHead = new Node();
		Node node = newHead;

		while (node1 != null && node2 != null) {
			if (node1.value.compareToIgnoreCase(node2.value) <= 0) {
				node.next = new Node(node1.value);
				node1 = node1.next;
			} else {
				node.next = new Node(node2.value);
				node2 = node2.next;
			}
			node = node.next;
		}

		while (node1 != null) {
			node.next = new Node(node1.value);
			node1 = node1.next;
			node = node.next;
		}

		while (node2 != null) {
			node.next = new Node(node2.value);
			node2 = node2.next;
			node = node.next;
		}

		return newHead;
	}

	static Node MergeLists(Node list1, Node list2) 
	{
		if (list1 == null) return list2;
		if (list2 == null) return list1;

		if (list1.value.compareToIgnoreCase(list2.value) <= 0) {
			list1.next = MergeLists(list1.next, list2);
			return list1;
		} else {
			list2.next = MergeLists(list2.next, list1);
			return list2;
		}
	}

	public static void main(String[] argv) throws Exception 
	{
		Node<String> node1 = new Node<String>("1");
		Node<String> node2 = new Node<String>("2");
		Node<String> node3 = new Node<String>("E");
		Node<String> node4 = new Node<String>("F");
		Node<String> node5 = new Node<String>("V");

		Node<String> nodeA = new Node<String>("1");
		Node<String> nodeB = new Node<String>("B");
		Node<String> nodeC = new Node<String>("C");
		Node<String> nodeD = new Node<String>("S");
		Node<String> nodeE = new Node<String>("T");

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;

		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = nodeE;
		nodeE.next = null;

		String s1 = "ABC";
		String s2 = "CBD";
		String s=s2;
		switch (s) {
			case "ABC":
				System.out.println(s);
				break;
			case "CBD":
				System.out.println(s);
				break;
		
		}
//		Node node = MergeLists(node1, nodeA);
		Node node = mergeSortedLists(node1, nodeA);
		
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
}
