package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class GenericTreeUse {
	
//1	
	public static void PrintTree(GenericTreeNode<Integer> root)//print tree in preorder format
	{
		if(root==null)
			return;
		System.out.println(root.data);
		for(int i=0;i<root.child.size();i++)
		{
			PrintTree(root.child.get(i));
		}
	}//not a good way................................

//2	
	public static void PrintTree2(GenericTreeNode<Integer> root)
	{
		//print the nodes of tree with childern also.....
		///no levelwise but preorder form.
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" : ");
		for(int i=0;i<root.child.size();i++)
		{
			System.out.print(root.child.get(i).data+ " ");
		}
		System.out.println();
		for(int i=0;i<root.child.size();i++)
		{
			PrintTree2(root.child.get(i));
		}
	}
	
//3
	public static int NumberOfNodes(GenericTreeNode<Integer> root)
	{
		if(root==null)
			return 0;
		int sum=1;
		for(int i=0;i<root.child.size();i++)
		{
			sum+=NumberOfNodes(root.child.get(i));
		}
		return sum;
	}
	
//4
	public static int sumOfNodes(GenericTreeNode<Integer> root)
	{
		if(root==null)
			return 0;
		int sum=root.data;
		for(int i=0;i<root.child.size();i++)
		{
			sum+=sumOfNodes(root.child.get(i));
		}
		return sum;
	}
	
//5
	 
	
//6
	public static void PrintLevelWise(GenericTreeNode<Integer> root)
	{
		Queue<GenericTreeNode<Integer>> q = new LinkedList<GenericTreeNode<Integer>>();
		q.add(root);
		q.add(null);
		while(q.isEmpty()!=true)
		{
			if(q.peek()!=null)
			{
				System.out.print(q.peek().data+" ");
				for(int i=0;i<q.peek().child.size();i++)
				{
					q.add(q.peek().child.get(i));
				}
				q.poll();	
			}
			else
			{
				q.poll();
				if(q.isEmpty()==true)
					break;
				else
				{
					System.out.println();
					q.add(null);
				}
					
			}
		}
	}
//7
	public static int greaterThanX(GenericTreeNode<Integer> root,int x)
	{
		//Given a tree and an integer x, find and return 
		//number of Nodes which are greater than x.
		
		if(root==null)
			return 0;
		int c=0;
		if(root.data>x)
			c++;
		for(int i=0;i<root.child.size();i++)
		{
			c+=greaterThanX(root.child.get(i), x);
		}
		return c;
		
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------
//										Driver Code
	
	public static void main(String[] args) {
		GenericTreeNode<Integer> root= new GenericTreeNode<Integer>(11);
		GenericTreeNode<Integer> c1= new GenericTreeNode<Integer>(21);
		GenericTreeNode<Integer> c2= new GenericTreeNode<Integer>(3);
		GenericTreeNode<Integer> c3= new GenericTreeNode<Integer>(0);
		GenericTreeNode<Integer> l1= new GenericTreeNode<Integer>(0);
		GenericTreeNode<Integer> l2= new GenericTreeNode<Integer>(6);
		root.child.add(c1);
		root.child.add(c2);
		root.child.add(c3);
		c2.child.add(l1);
		c2.child.add(l2);
		System.out.println(greaterThanX(root, 1));
		//System.out.println(sumOfNodes(root));
	}
}
