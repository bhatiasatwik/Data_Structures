package binaryTree;

public class BST_use {

	public static void main(String[] args) {
		BST b = new BST();
		b.Insert(2);
		b.Insert(1);
		b.Insert(5);
		b.Insert(4);
		b.Insert(7);
		b.PrintTree();
		System.out.println(b.isPresent(2));
		b.Delete(5);
		System.out.println(b.isPresent(5));
		b.PrintTree();
		
		
		
		

	}

}
