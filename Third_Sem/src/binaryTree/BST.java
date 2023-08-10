package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BST
	{
		private BinaryTreeNode<Integer> root;
		
		
		boolean isPresent(int x)
		{
			return isPresentHelper(root, x);
		}
		private static boolean isPresentHelper(BinaryTreeNode<Integer> node,int x)
		{
			if(node==null)
				return false;
			if(node.data==x)
				return true;
			if(node.data>x)
				return isPresentHelper(node.left, x);
			return isPresentHelper(node.right, x);
		}
		/*
		 * since the helper function is independent of the root i.e it does not depend on root 
		 * pass it any root and it will work to we have declared it as static 
		 */
		public  void  PrintTree()
		{
			PrintTreeHelper(root);
		}
		private static void PrintTreeHelper(BinaryTreeNode<Integer> node)
	
		{
			if(node==null)
				return ;
			Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
			q.add(node);
			while(true)
			{
				System.out.println();
				if(q.isEmpty()==true)
					break;
				System.out.print(q.peek().data+":");
				if(q.peek().left!=null)
				{
					System.out.print("L:"+q.peek().left.data);
				}
				else
				{
					System.out.print("L:"+"-1");
				}
				if(q.peek().right!=null)
				{
					System.out.print(",R:"+q.peek().right.data+" ");	
				}
				else
				{
					System.out.print("R:"+"-1");
				}
				if(q.peek().left!=null)
				q.add(q.peek().left);
				if(q.peek().right!=null)
				q.add(q.peek().right);
				q.remove();
			}
		}
		public void Insert(int x)
		{
			root =InsertHelper(root,x);
		}
		private BinaryTreeNode<Integer> InsertHelper(BinaryTreeNode<Integer> node,int x)
		{
			if(node==null)
			{
				return  new BinaryTreeNode<Integer>(x);
			}
			if(node.data>x)
			{
				node.left=InsertHelper(node.left, x);
			}
			else
				node.right=InsertHelper(node.right, x);
			return node;
		}
		
		public boolean Delete(int x)
		{
			/*
			 * 								THEORY:-(Pdhlo bhaisab😏😏😘)
			 * 
			 * There can be 3 cases 
			 * 1) if root==null
			 * 		return null;
			 * 2)if root.data>x --> call on left
			 * 3)if root.data<x --> call on right
			 * 4)if root.data==x
			 * 		- if no child, return null;
			 * 		- if 1 child, return that child
			 * 		- if 2 children, find the replacement node that satisfies the BST condition
			 * 			at the current node.
			 * 
			 *  Note:- the replacement node can  either be inorder successor or inorder predecessor.
			 *  ....................(max from left OR min from right)....................
			 */
			return DeleteHelper(root, x).isDelete;
			
		}
		private static int minimum(BinaryTreeNode<Integer> node)
		{
			if(node==null)
				return Integer.MAX_VALUE;
			return Math.min(Math.min(minimum(node.left),minimum(node.left)),node.data);
		}
		private BSTreturn DeleteHelper(BinaryTreeNode<Integer> node,int x)
		{
			if(node==null)
			{
				BSTreturn b = new BSTreturn();
				b.isDelete=false;
				b.newRoot=null;
				return b;
			}
			BSTreturn main = new BSTreturn();
			if(node.data>x)
			{
				BSTreturn  l =DeleteHelper(node.left, x);
				node.left=l.newRoot;
				main.isDelete=l.isDelete;
				main.newRoot=node;
				return main;
			}
			else
				if(node.data<x)
			{
				BSTreturn r = DeleteHelper(node.right, x);
				node.right=r.newRoot;
				main.isDelete=r.isDelete;
				main.newRoot=node;
				return main;
			}
				else		//here node with req data has been achieved
				{
					if(node.left==null&&node.right==null)//no child
					{
						main.isDelete=true;
						main.newRoot=null;
						return main;
					}
					else
						if(node.left==null&&node.right!=null)//only right child
						{
							main.isDelete=true;
							main.newRoot=node.right;
							return main;
							
						}
						else
							if(node.left!=null&&node.right==null)//only left child present
							{
								main.isDelete=true;
								main.newRoot=node.left;
								return main;
							}
							else	//both child are present
							{
								int replace=minimum(node.right);//finding minimum of right subtree..
								node.data=replace;
								node.right=DeleteHelper(node.right,replace).newRoot;
								main.isDelete=true;
								main.newRoot=node;
								return main;
								
							}
				}
		}
	}