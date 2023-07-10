package binaryTrees;

import linkedList.Node;
import linkedList.NodeUse;

public class BinarySearchTree {

//1
	static boolean searchInBST(BinaryTreeNode<Integer> root,int k)//search if Node with data value = k exists in given BST
	{
		if(root==null)
			return false;
		boolean sa=false;
		if(root.data>k)
		{
			sa=searchInBST(root.left, k);
			return sa;
		}
		else if(root.data<k)
			{
				sa=searchInBST(root.right, k);
				return sa;
			}
		else
		{
			return true;
		}
	}

//2
	static void range(BinaryTreeNode<Integer> root,int k1,int k2)
	{
		/*
		 * Given a Binary Search Tree and two integers k1 and k2,
		 *  find and print the elements which are in range k1 and k2 (both inclusive).
		 *  Print the elements in increasing order.
		 */
		
		//GANDA WALA......
		/*if(root==null)
			return;
		range(root.left,k1,k2);
		if(root.data>=k1&&root.data<=k2)
		{
			System.out.println(root.data);
		}
		range(root.right,k1,k2);
		*/
		
		//ACCHA WALA😁😄
		if(root==null)
			return;
		if(root.data>=k1&&root.data<=k2)
		{
			range(root.left,k1,k2);
			System.out.println(root.data);
			range(root.right,k1,k2);
		}
		if(root.data<k1)
			{
				range(root.right,k1,k2);
			}
		if(root.data>k2)
		{
			range(root.left,k1,k2);
		}
	}
	
		
//3
		static BinaryTreeNode<Integer> create(int a[],int n)//create BST from a given sorted array....
		{
			//Note:-the tree should be balanced(full or almost).
			return helperToCreate(a,0,n-1);
		}
		private static BinaryTreeNode<Integer> helperToCreate(int a[],int si,int ei)
		{
			if(si>ei)
				return null;
			int mi=(si+ei)/2;
			BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(a[mi]);
			BinaryTreeNode<Integer> left=helperToCreate(a, si, mi-1);
			BinaryTreeNode<Integer> right=helperToCreate(a, mi+1, ei);
			root.left=left;
			root.right=right;
			return root;
			
		}
		
//4
		public static bstMessenger isBST(BinaryTreeNode<Integer> root)
			/*
			 * Approach no-1
			 * order->O(n^2)/(nlogn);
			 * one call asks wether subtree is BST and other asks for
			 * largest/smallest respectively.
			 */
			
			
			/*
			  if(root==null)
				return true;
			boolean sl=isBST(root.left);
			boolean sr=isBST(root.right);
			
			int left=largest(root.left);
			int right=smallest(root.right);
			
			if(left<root.data&&right>root.data)
				return sl&&sr;
			else
				return false;
		}
		
		
		private static int largest(BinaryTreeNode<Integer> root)
		{
			if(root==null)
				return -999999;
			return Math.max(root.data,Math.max(largest(root.left),largest(root.right)));
		}
		
		
		private static int smallest(BinaryTreeNode<Integer> root)
		{
			if(root==null)
				return 999999999;
			return Math.min(root.data,Math.min(smallest(root.left),smallest(root.right)));
		}*/
		
		{
			if(root==null )
			{
				bstMessenger m = new bstMessenger();
				m.isBalanced=true;
				m.smallest=Integer.MAX_VALUE;	// or Int.max
				m.largest=Integer.MIN_VALUE;	//or  Int.min
				return m;
			}
			bstMessenger left=isBST(root.left);
			bstMessenger right = isBST(root.right);
			
			bstMessenger main = new bstMessenger();
//			if(left.largest>root.data||right.smallest<root.data)
//			{
//				main.isBalanced=false;
//			}
//			else
//			{
//				main.isBalanced=left.isBalanced&&right.isBalanced;
//			}
//			main.smallest=Math.min(left.smallest,right.smallest);
//			main.largest=Math.max(left.largest,right.largest);
//			return main;
			if(left.isBalanced==false||right.isBalanced==false)
			{
				main.isBalanced=false;
			}
			else if(left.largest>root.data||right.smallest<root.data)
			{
				main.isBalanced=false;
			}
			else
			{
				main.isBalanced=((left.isBalanced)&&(right.isBalanced));
			}
			main.smallest=Math.min(root.data,(Math.min(left.smallest,right.smallest)));
			main.largest=Math.max(root.data,(Math.max(left.largest,right.largest)));
			return main;	
		}
	
//5
		public static NodePair convert(BinaryTreeNode<Integer> root)
		{
			//Convert the given BST into a SORTED Linked List;
			
			if(root==null)
			{
				NodePair n = new NodePair();
				n.head=null;
				n.tail=null;
				return n;
			}
			
			NodePair left= convert(root.left);
			NodePair right= convert(root.right);
			NodePair current = new NodePair();
			Node<Integer> rt= new Node<Integer>(root.data);
			if(left.head!=null)
			{
				left.tail=rt;
				rt.next=right.head;
				current.head=left.head;
				current.tail=right.tail;
			}
			else
			{
				rt.next=right.head;
				current.head=rt;
				current.tail=right.tail;
			}
			return current;
		}
		
//6
		public static int replace(BinaryTreeNode<Integer> root)
		{
			if(root==null)
			{
				return 0;
			}
			int left=replace(root.left);
			int right=replace(root.right);
			root.data+=right;
			return root.data;
		}

	public static void main(String[] args) 
	{
		BinaryTreeUse n = new BinaryTreeUse();
		
		//int a[]= {1,2,3,4,5,6,7};
		BinaryTreeNode<Integer> root= n.takeInputLevelwise();
		replace(root);
		n.printLevelWise(root);
		
}	
	}


