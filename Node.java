package og_code;

public class Node {
	private Comparable data;
	private int height;
	private Node parent, leftChild, rightChild;

	

	public Node() {
		this.data = null;
		this.height = 1;
		this.parent = null;
		this.leftChild = null;
		this.rightChild = null;
	}

	public Node(Comparable data) {
		this.data = data;
		this.parent = null;
		this.leftChild = null;
		this.rightChild = null;
	}

	public Node(Comparable data, int bf, Node parent, Node leftChild, Node rightChild) {
		this.data = data;
		this.parent = parent;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	
	public void setData(Comparable data) {
		this.data = data;
	}

	public void setHeight(int h) {
		height = h;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	public Comparable getData() {
		return data;
	}

	public int getHeight() {
		return height;
	}

	public Node getParent() {
		return parent;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}
}
