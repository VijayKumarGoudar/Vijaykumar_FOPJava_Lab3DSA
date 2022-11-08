package problem2;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	Node root;

	//Method search for 2nd pairing element if found return true
	public boolean searchElement(Node root, int val) {
		if (root != null) {
			if (root.data == val) {
				return true;
			} else if (val > root.data) {
				return searchElement(root.right, val);
			} else {
				return searchElement(root.left, val);
			}
		}
		return false;
	}

	//Method will pick element and search for pair if found method will break and complete.
	public void findPair(Node root, int sum) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		boolean isPairFound = false;
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			isPairFound = searchElement(root, sum - temp.data);
			if (isPairFound) {
				System.out.printf("Pair is (%d,%d)",temp.data,(sum-temp.data));
				break;
			}
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}

		if (!isPairFound) {
			System.out.println("Nodes are not found");
		}

	}


	public Node insert(Node root, int data) {
		Node temp = new Node(data);
		if (root == null) {
			root = temp;
			return root;
		}

		Node current = root;
		if (current.data > data) {
			root.left = insert(root.left, data);
		} else if (current.data < data) {
			root.right = insert(root.right, data);
		}
		return root;
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
}
