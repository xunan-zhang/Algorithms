package zxa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import zxa.FindMiddleElementOfList.Node;

class Students {
	String name;
	int		age;
	
	Students(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class removeDuplicateElements {
	static class Node<T> {
		String		value;
		Node 	next;
		
		Node(){};
		Node(String s) {
			value = s;
		}
	}
	
	public static void main(String []argv)
	{
		Node node1 = new Node("1");
		Node node2 = new Node("2");
		Node node3 = new Node("3");
		Node node4 = new Node("4");
		Node node5 = new Node("4");
		Node node6 = new Node("6");
		Node node7 = new Node("7");
		Node node8 = new Node("8");
		Node node9 = new Node("4");
		Node node10 = new Node("10");
		Node node11 = new Node("11");
		Node node12 = new Node("12");
		
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
		
		Node head = new Node();
		checkDuplicate(head, node1);
		
		Students S1 = new Students("taj",21);
        Students S2 = new Students("taj",21);

        int i1 = "taj".hashCode();
        int i2 = "taj".hashCode();
        System.out.println();
        System.out.println(S2.hashCode());

        HashMap<Integer,String > HM = new HashMap<Integer,String > (); 
        HM.put(i1, "tajinder");
        HM.put(i2, "tajinder2");
        System.out.println(HM.size());
        
		while(head.next != null) {
			System.out.println(head.value);
			head = head.next;
		}
		
		checkDuplicateElements();
	}
	
	static void checkDuplicateElements() {
	    List<String> list = new ArrayList<String>();  
	    list.add("Mango");  
	    list.add("Banana");  
	    list.add("Mango");  
	    list.add("Apple");  
	    System.out.println(list.toString());  
	    Set<String> set = new LinkedHashSet<String>(list);  
	    System.out.println(set);
	}
	
	static void checkDuplicate(Node newHead, Node oldHead) {
		HashMap<Integer,String> hashmap = new HashMap<Integer, String>();
		while (oldHead != null) {
			int hashcode = ((String)oldHead.value).hashCode();
			if (hashmap.get(hashcode) == null) {
				newHead.value = oldHead.value;
				newHead.next = new Node();
				newHead = newHead.next;
				hashmap.put(hashcode, (String)oldHead.value);
			}
			oldHead = oldHead.next;
		}
	}
}
