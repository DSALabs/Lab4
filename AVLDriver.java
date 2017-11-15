package og_code;

public class AVLDriver {

	public static void main(String[] args) {
		AVLTree theTree = new AVLTree();

		AVLTree.insert(theTree, 20);
		AVLTree.insert(theTree, 10);
		AVLTree.insert(theTree, 25);
		AVLTree.insert(theTree, 15);
		AVLTree.insert(theTree, 30);
		AVLTree.insert(theTree, 5);


		System.out.println("remove key 25 ");

		AVLTree.delete(theTree, 30);

		// Find node with key 30
		System.out.println("Search for 30 ");

		System.out.println(AVLTree.search(theTree, 30));

		// System.out.println(AVLTree.search(theThree, 30).leftChild);
	}

}
