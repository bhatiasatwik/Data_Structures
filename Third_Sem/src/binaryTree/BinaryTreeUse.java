package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import LinkedList.Node;
import LinkedList.NodeUse;

public class BinaryTreeUse {
	
	//1
	static void printTree(BinaryTreeNode<Integer> root)//print the tree 
	{	
		//OPTION 1:-
		/*if(root==null)
			return;
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);*/
		
		//OPTION 2:-
		if(root==null)
			return;
		System.out.print(root.data+":");
		if(root.left!=null)
			System.out.print(" L"+root.left.data);
		if(root.right!=null)
			System.out.print(" R"+root.right.data);
		System.out.println();
		printTree(root.left);
		printTree(root.right);
	}
	
//2	
	static BinaryTreeNode<Integer>  takeInput(boolean isRoot,int root,boolean isLeft)//taking input in the tree
	{
		/*Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value");
		int n=scn.nextInt();
		if(n==-1)
			return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(n);
		BinaryTreeNode<Integer> left=takeInput();
		BinaryTreeNode<Integer> right=takeInput();
		root.left=left;
		root.right=right;
		return root;*/
		
		
		Scanner scn = new Scanner(System.in);
		if(isRoot)
		{
			System.out.println("Enter the root value");
		}
		else
			if(isLeft)
			{
				System.out.println("Enter the left value of "+root);
			}
			else
				System.out.println("Enter the right value for "+root);
		int n=scn.nextInt()	;
		if(n==-1)
			return null;
		BinaryTreeNode<Integer> root1= new BinaryTreeNode<Integer>(n);
		BinaryTreeNode<Integer> s1=takeInput(false, root1.data,true);
		BinaryTreeNode<Integer> s2=takeInput(false, root1.data,false);
		root1.left=s1;
		root1.right=s2;
		return root1;
	}
	
//3	
	static int numberOfNodes(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return 0;
		int sa1=numberOfNodes(root.left);
		int sa2=numberOfNodes(root.right);
		return(sa1+sa2+1);
	}
	
//4	
	static int sumOfNodes(BinaryTreeNode<Integer> root)//sum of all data members of all the nodes
	{
		if(root==null)
			return 0;
		int s1=sumOfNodes(root.left);
		int s2=sumOfNodes(root.right);
		return (root.data+s1+s2);
	}
	
//5	
	static void printPreOrder(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return;
		System.out.println(root.data);
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
	
//6	
	static void printPostOrder(BinaryTreeNode<Integer> root)
	{	
		if(root==null)
			return ;
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.println(root.data);
	}
	
//7	
	static void printInOrder(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return ;
		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);
	}
	
//8	
	static int largestDataNode(BinaryTreeNode<Integer> root)//largest data contained by the tree
	{
		int large=0;
		if(root ==null)
			return large;
		int s1=largestDataNode(root.left);
		int s2=largestDataNode(root.right);
		large=(s1>s2?s1:s2);
		if(large>root.data)
			return large;
		return root.data;
	}
	
//9 
	static int greaterThanX(BinaryTreeNode<Integer> root,int X)	//return number of nodes with data value greater than X; 
	{	
		if(root==null)
			return 0;
		int s1=greaterThanX(root.left, X);
		int s2=greaterThanX(root.right, X);
		if(root.data>X)
			return(s1+s2+1);
		else
			return (s1+s2);
	}
	
//10
	static int heightOfTree(BinaryTreeNode<Integer> root)// total no of nodes along longest path to any leaf node
	{
		if(root==null)
			return 0;
		int s1=heightOfTree(root.left);
		int s2=heightOfTree(root.right);
		if(s1>s2)											//to find max height
			return s1+1;	// Theese are the 
		return s2+1;		//most important steps
	}
	
//11
	static int leafNodes(BinaryTreeNode<Integer> root)//find number of leaves of given tree
	{
		/*if(root==null)
			return 0;
		int s1=leafNodes(root.left);
		int s2=leafNodes(root.right);
		if(root.left==null&&root.right==null)
			return (s1+s2+1);
		else
			return (s1+s2);*/
		
				/*OR*/
		if(root==null)
			return 0;
		if(root.left==null&&root.right==null)
			return 1;
		else
			return(leafNodes(root.left)+leafNodes(root.right)); 
					
	}
	
	
//12	
	static void printAtDepthK(BinaryTreeNode<Integer> root, int k)//print all the nodes present at depth K from the root
	{
		if(root==null)
			return;
		if(k==0) {
			System.out.println(root.data);
			return;}
		printAtDepthK(root.left, k-1);//Do not do k--!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		printAtDepthK(root.right, k-1);
	}
	
//13
	static void replaceByDepth(BinaryTreeNode<Integer> root)//replace each node element by its depth
	{
		replacehelper(root,0);
	}
	static void replacehelper(BinaryTreeNode<Integer> root,int level)
	{
		if(root==null)
			return;
		replacehelper(root.left, level+1);
		replacehelper(root.right, level+1);
		root.data=level;
	}
//14
	static boolean isPresent(BinaryTreeNode<Integer> root,int x)//to check if node with given data exists
	{
		if(root==null)
			return false;	//It cant be true..as if it will be true our ans will always be true....
		boolean sa1=isPresent(root.left,x);
		boolean sa2=isPresent(root.right,x);
		if(root.data==x)
			return true;
		else
			return(sa1||sa2);
	}
	
//15
	static void printLeaf(BinaryTreeNode<Integer>root)//print all leaf nodes
	{
		if(root==null)
			return;
		if(root.left==null&&root.right==null)
			{
				System.out.println(root.data);
				return;
			}
		else
		{
			printLeaf(root.left);
			printLeaf(root.right);
		}
			
	}
//16	
	static void NodesWithoutSiblings(BinaryTreeNode<Integer> root)//print the nodes without any sublings
	{
		if(root==null)
			return;
		if(root.left==null&&root.right!=null)
		{
			System.out.println(root.right.data);
		}
		if(root.left!=null&&root.right==null)
		{
			System.out.println(root.left.data);
		}
		NodesWithoutSiblings(root.left);
		NodesWithoutSiblings(root.right);
	}
	
//17
	static BinaryTreeNode<Integer> removeleaf(BinaryTreeNode<Integer> root)//remove all the leaf nodes from the tree
	{
		//OPTION_1
		//does not return anything will fail if root is leaf node		
		/*
		if(root==null)
			return ;
		if(root.left!=null&&root.left.left==null&&root.left.right==null)
		{
			root.left=null;
		}
		if(root.right!=null&&root.right.left==null&&root.right.right==null)
		{
				root.right=null;
		}
			
			removeleaf(root.left);
			removeleaf(root.right);
		*/
		
		//OPTION_2
		//return modified root
		
		if(root==null)
			return null;
		if(root.left==null&&root.right==null)
			return null;//recursive call after not before.........IMPORTANT
		root.left=removeleaf(root.left);
		root.right=removeleaf(root.right);
		return root;
	}
	
//18	
	static void mirrorTree(BinaryTreeNode<Integer> root)//mirror the given tree i.e. all right become left and vice versa
	{
		if(root==null)
			return;
		mirrorTree(root.left);
		mirrorTree(root.right);
		BinaryTreeNode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
		
	}
	
//19
	static messenger isBalanced(BinaryTreeNode<Integer> root)
	{	
		//O(n2)approach->
		/*
	   if(root==null)
		return true;
		boolean sa=(isBalanced(root.left)&&isBalanced(root.right));
		float heightleft=heightOfTree(root.left);
		float heightright=heightOfTree(root.right);
		if(Math.abs(heightright-heightleft)<=1)
			return sa;
		return false;
		*/
		
		//O(N) approach->
		
		if(root==null)//base case of recursion
		{
			messenger m = new messenger();
			m.height=0;
			m.isBalanced=true;
			return m;
		}
		messenger ml = isBalanced(root.left);
		messenger mr= isBalanced(root.right);
		messenger main = new messenger();
		if(Math.abs(ml.height-mr.height)<=1)
		{
			main.isBalanced=true;
		}
		else
		{
			main.isBalanced=false;
		}
		main.height=Math.max(ml.height, mr.height)+1;
		main.isBalanced=main.isBalanced&&ml.isBalanced&&mr.isBalanced;
		return main;
		/*
		 here we are returning two data/infomation in recursive call
		 1)Wether the subtree for which recursion was called is balanced 
		 	or not 
		 2)the height uptil the subtree.........
		 To do so we have created a class with 2 members namely 
		 height(int) and is balanced(boolean).
		 */
	}
	
//20
	static messenger diameter(BinaryTreeNode<Integer> root)	//diameter is defined as longest path betwen two leaf nodes 
	{														//the two leaf nodes can be either in different subtree or same
		if(root==null)
		{
			messenger  m= new messenger();
			m.height=0;
			m.diameter=0;
		}
		messenger m1=diameter(root.left);
		messenger m2=diameter(root.right);
		messenger main = new messenger();
		main.height=(Math.max(m1.height, m2.height)+1);
		main.diameter=Math.max(Math.max(m1.diameter,m2.diameter),m1.height+m2.height+1);//imp.....
		return main;
		//can refer to love babbar video(Q-2) ==> https://www.youtube.com/watch?v=nHMQ33LZ6oA
	}
	
//21
	static BinaryTreeNode<Integer> takeInputLevelwise()
	{
		int c=0;
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
		BinaryTreeNode<Integer> root=null;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the root data value babes");
		int n= scn.nextInt();
		if(n==-1)
			return root;
		BinaryTreeNode<Integer> node= new BinaryTreeNode<Integer>(n);
		root=node;
		q.add(root);
		boolean isLeft=true;
		do {
			
			if(c==2)
			{
				q.remove();
				c=0;
			}
			if(q.isEmpty()==true)
			{
				break;
			}
			if(isLeft)
			{
				isLeft=!isLeft;
				c++;
				System.out.println("Enter the left value of "+q.peek().data);
				n=scn.nextInt();
				if(n==-1)
					continue;
				BinaryTreeNode<Integer>node1= new BinaryTreeNode<Integer>(n);
				q.peek().left=node1;
				q.add(node1);
			}
			else
			{
				isLeft=!isLeft;
				c++;
				System.out.println("Enter the right value of "+q.peek().data);
				n=scn.nextInt();
				if(n==-1)
					continue;
				BinaryTreeNode<Integer>node1= new BinaryTreeNode<Integer>(n);
				q.peek().right=node1;
				q.add(node1);
				
			}
			
		} while (q.isEmpty()!=true);
		scn.close();  	
		return root;
	}
	
//22
	static void printLevelWise(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return ;
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
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
	
//23
	static BinaryTreeNode<Integer> create(int in[],int pre[])
	{
		/*
		 Steps to be followed are as follows:-
		 
		 1) Find the root
		 
		 2)find inorder of both left and right 
		 subtree
		 
		 3)find preorder of left and right
		 4)use recursion to build left and right 
		 subtree
		 
		 5)link both subtree(Left and right respectively)
		 to the root and return the root 
		 
		 
		 //Every data should be unique.............
		 
		 */
		return (helperToCreate(in,pre,0,in.length-1,0,pre.length-1));
	}
	static BinaryTreeNode<Integer> helperToCreate(int in[],int pre[],int siIn,int eiIn,int siPre,int eiPre)
	{
		if(siIn>eiIn)//or siPre>eiPre
			return null;
		int index=0;
		for(int i=siIn;i<=eiIn;i++)
		{
			if(in[i]==pre[siPre])
			{
				index=i;
				break;
			}
		}
		int length=index-siIn;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(pre[siPre]);
		BinaryTreeNode<Integer> left=helperToCreate(in,pre,siIn,index-1,siPre+1,siPre+1+length-1);
		BinaryTreeNode<Integer> right=helperToCreate(in,pre,index+1,eiIn,siPre+1+length-1+1,eiPre);
		root.left=left;
		root.right=right;
		return root;
	}
	
//24
	public static void insertDuplicate(BinaryTreeNode<Integer> root)
	{
		/*
	  	For a given a Binary Tree of type integer, duplicate every node of 
	   	the tree and attach it to the left of itself.
	   	The root will remain the same. So you just need to
 		insert nodes in the given Binary Tree......
		 */
		
		
		if(root==null)
			return;
		insertDuplicate(root.left);
		insertDuplicate(root.right);
		BinaryTreeNode<Integer> duplicateNode = new BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer> temp=root.left;
		root.left=duplicateNode;
		duplicateNode.left=temp;
		
	}
	
//25
	static messenger minMax(BinaryTreeNode<Integer> root)
	{
		return minMaxHelper(root,root.data,root.data);
	}
	static messenger minMaxHelper(BinaryTreeNode<Integer>  root,int min,int max)
	{
		if(root==null)
		{
			messenger m = new messenger();
			m.min=min;
			m.max=max;
			return m;
		}
		messenger Leftm=minMaxHelper(root.left, min, max);
		messenger Rightm=minMaxHelper(root.right,min,max);
		int newMin=Math.min(Leftm.min,Rightm.min);
		int newMax=Math.max(Leftm.max,Rightm.max);
		messenger main = new messenger();
		if(root.data>newMax)
		{
			main.max=root.data;
		}
		else
		{
			main.max=newMax;
		}
		if(root.data<newMin)
		{
			main.min=root.data;
		}
		else
		{
			main.min=newMin;
		}
		return main;
	}
	
//26
	static void pathK(BinaryTreeNode<Integer> root , int k , String s)
	{
		/*
		 For a given Binary Tree of type integer and a number K, print 
		 out all root-to-leaf paths where the sum of all the node data 
		 along the path is equal to K.
		 */
		
		if(root==null)//imp to prevent stackOverFlow error
			return;
			if(root.left==null&&root.right==null)//checking if current node is leaf node
			{
				if(k==root.data)
				{
					s=s+" "+root.data;
					System.out.println(s);
				}
				return;
			}
			s=s+" " +root.data;
			pathK(root.left, k-root.data, s);//k-root.data to be passed.........IMP!!!
			pathK(root.right,k-root.data,s);
	}
	
//27
	public static void printLevelWiseII(BinaryTreeNode<Integer> root)//level order traversal
	{
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
		q.add(null);//act as a delimiter
		while(true)
		{
			if(q.isEmpty()==true)
				break;
			if(q.peek()==null)
			{
				q.poll();
				if(q.isEmpty())
					break;//its a very important
				else {
				System.out.println();
				q.add(null);
				}
				
			}
			else
			{
				System.out.print(q.peek().data+" ");
				if(q.peek().left!=null)
				q.add(q.peek().left);
				if(q.peek().right!=null)
				q.add(q.peek().right);
				q.poll();
			}
		}	
		
	}
//28
	static int printAtKthDistance(BinaryTreeNode<Integer> root, int target, int k)//print all the nodes at distance k from target
	{
		if(root==null)
			return -1;
		if(root.data==target)
		{
			printAtDepthK(root, k);
			return 1;
		}
		int leftDistance=printAtKthDistance(root.left, target, k);
		if(leftDistance!=-1)
		{
			if(leftDistance==k)
			{
				System.out.println(root.data);
				return leftDistance+1;
			}
			else
			{
				printAtDepthK(root.right,k-leftDistance-1);
				return leftDistance+1;
			}
		}
		int rightDistance=printAtKthDistance(root.right, target, k);
		if(rightDistance!=-1)
		{
			if(rightDistance==k)
			{
				System.out.println(root.data);
				return rightDistance+1;
			}
			else
			{
				printAtDepthK(root.left, k-rightDistance-1);
				return rightDistance+1;
			}
		}
		return -1;
	}
	/*
	 static void printAtDepthK(BinaryTreeNode<Integer> root, int k)//print all the nodes present at depth K from the root
	{
		if(root==null)
			return;
		if(k==0) {
			System.out.println(root.data);
			return;}
		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}

	public static int nodesAtDistanceK(BinaryTreeNode<Integer> root, int target, int k) {
	   if(root==null)
		{
			return -1;
		}
		if(root.data==target)
		{
			printAtDepthK(root,k);
			return 1;
		}
		int s1= nodesAtDistanceK(root.left, target, k);
		if(s1!=-1)
		{
			if(k-s1==0)
			System.out.println(root.data);
			printAtDepthK(root.right, k-s1-1);
			return s1+1;
		}
		int s2= nodesAtDistanceK(root.right, target, k);
		if(s2!=-1)
		{if(k-s2==0)
			System.out.println(root.data);
			printAtDepthK(root.left, k-s2-1);
			return s2+1;
		}
		return -1;
		
	}
	}

	 */
//29
	public static ArrayList<Node<Integer>> constructLevelWiseLL(BinaryTreeNode<Integer> root)
	{
		/*
		 * Given a binary tree, write code to create a separate linked list for each level.
		 *  You need to return the array which contains head of each level linked list.
		 */
		
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
		ArrayList<Node<Integer>>  a = new ArrayList<Node<Integer>>();
		if(root==null)
			return a;//checkmate😘😏
		BinaryTreeNode<Integer> dummy = new BinaryTreeNode<Integer>(-1);
		Node<Integer> head=null,tail=null;
		q.add(root);
		q.add(dummy);
		while(q.isEmpty()!=true)
		{
			if(q.peek()==dummy)//delimeter;
			{
				a.add(head);
				head=null;
				tail=null;
				q.poll();
				if(q.isEmpty())
				{
					break;//prevent infinite loop;
				}
				else
				{
					q.add(dummy);
				}
			}
			else
			{
				Node<Integer> current = new Node<Integer>(q.peek().data);
				if(head==null)
				{
					head=current;
					tail=current;
				}
				else
				{
					tail.next=current;
					tail=current;
				}
				if(q.peek().left!=null)
					q.add(q.peek().left);
				if(q.peek().right!=null)
					q.add(q.peek().right);
				q.remove();
			}
		}
		return a;
		//Side note:-(Padhle sale alas mat kr👁️😒😒)
		/*
		 * if you want to solve the given problem without using LL node 
		 * then what you can do is after adding the left and right to the queue set 
		 * q.peek().left->null and q.peek().right-> to next member of queue 
		 * until dummy node is not encountered.
		 * this will create LL type structure from tree itself
		 * Now,when dummy is reached,store the head of new created list in the 
		 * array list and repeat the process  ......🔁🔁🔁🔁
		 */
		
	}
	
//30
	public static bstMessenger largestBSTSubtree(BinaryTreeNode<Integer> root)
	{
		/*
		 * Given a Binary tree, find the largest BST subtree. 
		 * That is, you need to find the BST with maximum height in the given 
		 * binary tree. 
		 * You have to return the height of largest BST.
		 */
		if(root==null)
		{
			bstMessenger b = new bstMessenger();
			b.height=0;
			b.isBalanced=true;
			b.smallest=Integer.MAX_VALUE;
			b.largest=Integer.MIN_VALUE;
			return b;
		}
		bstMessenger left=largestBSTSubtree(root.left);
		bstMessenger right=largestBSTSubtree(root.right);
		bstMessenger mains = new bstMessenger();
		mains.largest=Math.max(left.largest,Math.max(right.largest,root.data));
		mains.smallest=Math.min(left.smallest,Math.min(right.smallest,root.data));
		mains.isBalanced=false;
		if(left.isBalanced==true&&right.isBalanced==true)//-----------------------------------(1)
		{
			if(left.largest<root.data&&right.smallest>=root.data)
			{
				mains.isBalanced=true;
				mains.height=Math.max(left.height,right.height)+1;
			}
			else
			{
				mains.height=Math.max(left.height,right.height);
			}
		}
		else
			mains.height=Math.max(left.height,right.height);//-------------------------------(2)
		//agr condition (1) false hai to iska mtlb ki tree ko bst search krne ka koi mtlb hi ni hai
		//pr ye possible hai ki left ya right tree me se kisi ek me ek bada bst present ho 
		//jbki vo khud bst na ho 
		/*
		   5
		  / \
		 6  10
		/ \
	   2  3
	       \ 
	       9
	       yhan pr 6 root wala tree khud to bst nai hai pr na iske pas 3 root wala aisa tree hai
	       jo zayda bada bst hai to iss case ko check krne k lie hum condtion number (2) lagae hai
	       taki bhale tree khud bst na bhi ho pr kya pta  uske pas bada bst ho subtree me.
	       6  ke subtree ki height-->2
	       10 ke subtree ki height-->1
	       to condn number (2) hai necessary
	       aisa mt krna ki agr tree khud bst hai to hi uski height dere ho ..............
		 */
		return mains;
	}
	
//-------------------------------------------------------------------------------------------------------		
//									Driver code
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root =takeInputLevelwise();
		System.out.println(largestBSTSubtree(root).height);
	//	NodeUse n = new NodeUse();
	//	ArrayList<Node<Integer>> a= constructLevelWiseLL(root);
	//	System.out.println(a.isEmpty());
	//	n.printRec(a.get(2));
	//	printLevelWiseII(root);
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> left = new BinaryTreeNode<>(2);
//		BinaryTreeNode<Integer> right = new BinaryTreeNode<>(3);
//		root.left=left;
//		root.right=right;
//		BinaryTreeNode<Integer> left_Right = new BinaryTreeNode<>(4);
//		BinaryTreeNode<Integer> right_Left = new BinaryTreeNode<>(5);
//		left.right=left_Right;
//		right.left=right_Left;
		
		
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> left = new BinaryTreeNode<>(2);
//		BinaryTreeNode<Integer> right = new BinaryTreeNode<>(3);
//		root.left=left;
//		root.right=right;
//		BinaryTreeNode<Integer> left_left= new BinaryTreeNode<>(4);
//		BinaryTreeNode<Integer> left_right = new BinaryTreeNode<>(5);
//		left.left=left_left;
//		left.right=left_right;
//		
	//	printTree(root);
		
	//root=removeleaf(root);
		
		
		
		//printTree(root);
		
		//BinaryTreeNode<Integer> root= takeInputLevelwise();
		//insertDuplicate(root);
		//printLevelWiseII(root);
		
		//messenger recieve=minMax(root);
		//System.out.println(recieve.max+" "+recieve.min);
		//printLevelWise(root);
		
	//	BinaryTreeNode<Integer> root=takeInput(true,0,true);
	//	System.out.println(isBalanced(root).isBalanced);
		
		//printPreOrder(root);
		//int in[]= {2,1,3};
		//int pre[]= {1,2,3};
		//printLevelWise(create(in,pre)); 
		//printAtKthDistance(takeInputLevelwise(), 5, 3);
//		
//		printPreOrder(root);
		
//		printPostOrder(root);
		
//		printInOrder(root);
		
//		System.out.println(largestDataNode(root));
		
//		System.out.println(numberNodes(root));
		
//		System.out.println(greaterThanX(root, 3));
		
//		System.out.println(heightOfTree(root));
		
//		System.out.println(leafNodes(root));
		
//		printAtDepthK(root, 3);
		
//		System.out.println(isPresent(root, 10));
		
//		nodesWithoutSiblings(root);
		
//		replaceByDepth(root);
		
		
//		NodesWithoutSiblings(root);
//		printTree(root);
		
	}
}
