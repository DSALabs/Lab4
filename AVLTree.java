package og_code;

import java.util.*;

public class AVLTree extends Tree {

	private Node root;

	public AVLTree() {
		root = null;
	}

	//return height of tree
	public int height(Node n) {
		if (n == null) {
			return 0;
		}
		return n.getHeight();
	}
	
	//return max of two comparable data types
	public Comparable max(Comparable a, Comparable b) {
		if (a.compareTo(b) == 1) {
			return a;
		} else {
			return b;
		}
	}

	public Node rightRotate(Node y) {
		Node x = y.getLeftChild();
		Node T2 = x.getRightChild();

		// Perform rotation
		x.setRightChild(y);
		y.setLeftChild(T2);

		// Update heights
		y.setHeight(max(height(y.getLeftChild()), height(y.getRightChild())) + 1);
		x.setHeight(max(height(x.getLeftChild()), height(x.getRightChild())) + 1);

		// Return new root
		return x;
	}

	Node leftRotate(Node x) {
        Node y = x.getRightChild();
        Node T2 = y.getLeftChild();
 
        // Perform rotation
        y.setLeftChild(x);
        x.setRightChild(T2);
 
        //  Update heights
        x.height = max(height(x.getLeftChild()), height(x.getRightChild())) + 1;
        y.height = max(height(y.getLeftChild()), height(y.getRightChild())) + 1;
 
        // Return new root
        return y;
    }

	// returns a Boolean indicating whether the Comparable object is in the tree.
	public static boolean search(AVLTree tree, Comparable data) {
		// Start at the top of the tree
		Node focusNode = tree.root;

		// while we havn't found the node keep looking
		while (focusNode != data) {

			// if we should search to the left
			if (data.compareTo(focusNode.getData()) < 0) {

				// shift the focus node to the left child
				focusNode = focusNode.getLeftChild();

			} else {

				// shift the node to the right child
				focusNode = focusNode.getRightChild();
			}

			// The node wasn't found
			if (focusNode == null) {
				return false;
			}
		}
		return true;
	}

	public static boolean insert(AVLTree tree, Comparable data) {

		/*
		 * Insert by searching for correct position and inserting new node Backtrack up
		 * chain of parents correct balance factor of each node along way If a node is
		 * unbalanced call it x and balance
		 */
		// If empty
		if (tree.root == null) {
			// New node becomes root
			tree.root = new Node(data);
			return true;
		} else {
			// TODO create this add method
			// add(Node n, Node newNode);
			Node focusNode = tree.root;

			Node parent = tree.root;

			while (true) {

				parent = focusNode;
				// ORRRR focusNode.setParent(focusNode);
			}
		}

		return false;
	}

	public static AVLTree delete(AVLTree tree, Comparable object) {
		return tree;
	}

	public static ArrayList<Node> in_order(AVLTree tree) {
		ArrayList<Node> list = new ArrayList<>();
		return list;
	}

	public int count(AVLTree tree, int a, int b) {
		return 0;

	}

	public void setRoot(Node n) {
		root = n;
	}

	public Node getRoot() {
		return root;
	}
}
