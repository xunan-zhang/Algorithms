/**
 * 
 */
package zxa;

public class PreOrderTree {
	static class Node {
		String  value;
		Node 	left;
		Node 	right;
		
		Node(String value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}

	void preOrder(Node node) {
		if (node == null) 
			return;
		
		System.out.println(node.value);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public static void main(String []argv)
	{
		Node node1;
		Node node2;
		Node node3;
		Node node4;
		Node node5;
		Node node6;
		Node node7;
		Node node8;
		Node node9;
		
		node4 = new Node("4", null, null);
		node5 = new Node("5", null, null);
		node6 = new Node("6", null, null);
		node7 = new Node("7", null, null);
		node3 = new Node("3", node6, node7);
		node2 = new Node("2", node4, node5);
		node1 = new Node("1", node2, node3);

		PreOrderTree test = new PreOrderTree();
		test.preOrder(node1);
	}
	
}
