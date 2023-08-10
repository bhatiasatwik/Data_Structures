package binaryTree;

import java.util.ArrayList;

public class GenericTreeNode<T> {
	 T data;
	ArrayList<GenericTreeNode<T>> child;
	
	public GenericTreeNode(T data) {
		this.child= new ArrayList<GenericTreeNode<T>>();	
		this.data=data;
	}
}
