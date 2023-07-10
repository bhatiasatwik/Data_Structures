package linkedList;
import java.util.*;

import binaryTrees.BinaryTreeNode;
public class NodeUse {
	
//1	
	 public static int findNode(Node<Integer> head,int n)// return pos of node with n value.
	{
		if(head==null)
			return -1;
		if(head.data==n)
			return 0;
		int sa=findNode(head.next,n);
		if(sa==-1)
			return sa;
		return sa+1;
	}
	
//2
	 public static int print_I_th(Node<Integer> head,int n)//returns ith node.
	{
		for(int i=0;head!=null;i++)
		{
			if(i==n)
				return head.data;
			head=head.next;
		}
		return -1;
	}

//3	
	 public static void printRec(Node<Integer> head)//print the LL recursively in correct order
	{
		if(head==null)
			return;
		System.out.println(head.data);		//<--------A		if we want to print in reverse
			printRec(head.next);			//<--------B  	 	just reverse order of these two 
	}
	
//4	
	static Node<Integer> duplicate(Node<Integer> head)//remove consecutive duplicate nodes
	{
		/*Node<Integer> n=head;
		int c=0;
		Node<Integer> prev=null;
		while(n!=null)
		{
			if(n.data==c)
				{	
				prev.next=n.next;
				}
			
			else 
			{
					c=n.data;
					prev=n;
			}
			n=n.next;
		}
		return head;*/
		
		Node<Integer> tail=head;
		while(tail.next!=null)
		{
			if(tail.data==tail.next.data)
			{
				tail.next=tail.next.next;
//				tail=tail.next;<<<<------------------------------------------------No need(Can be skipped,if not no error then also) 
			}
			else
				tail=tail.next;
		}
		return head;
	}
	
//5	
	static Node<Integer> reverse(Node<Integer> head)//reverse the given LL and return new head.
	{
		Node<Integer> tail=head,temp=null,prev=null;
		while(tail!=null)
		{
			temp=tail.next;
			if(tail==head)
			{
				tail.next=null;
				prev=tail;
			}
			else
			{
				tail.next=prev;
				prev=tail;
			}
			tail=temp;
		}
		return prev;	//*****!!!!!*****// Not tail as "tail=null"
			
	}
	
	//6
	static boolean isPalindrome(Node<Integer>head)
	{
		/*Node<Integer>n=head;
		Node<Integer>n1=head;
		int l=0;
		while(n1!=null)
			{
			n1=n1.next;
			l++;
			}
		Node<Integer>a[]=new Node[l];
		int i=0;
		while(n!=null)
		{
			a[i]=n;
			i++;
			n=n.next;
		}
		for(int j=0;j<=a.length/2;j++)
		if(a[j].data!=a[a.length-1-j].data)
			return false;
				return true;*/
		
		Node<Integer>s=head,f=head;
		while(f!=null&&f.next!=null)
		{
			s=s.next;
			f=f.next.next;
		}
		Node<Integer> h1 = reverse(s);
		while(h1!=null)//or(head!=s)
		{
			if(head.data!=h1.data)
				return false;
			h1=h1.next;
			head=head.next;
		}
		return true;
		
	}
	
	//7
	static Node<Integer> remove(Node<Integer> head,int n)// removes the node at 'n'th position.
	{
		
		/*int l=0;
		Node<Integer> n1 = head;
		Node<Integer> n2 = head;
		while(n2!=null)
		{
			l++;
			n2=n2.next;
		}
		for(int i=0;i<=l-n;i++)
		{
			if(n1==null)
				return head;
			n1=n1.next;
		}
		Node<Integer> t =n1.next;
		n1.next=null;
		Node<Integer> t1 =t; 
		while(t.next!=null)
			t=t.next;
		t.next=head;
		System.out.println(t1.data);
		return t1;*/
		
		
		Node<Integer> tail=head;
		for(int i=0;i<n-1;i++)
		{
			tail=tail.next;
		}
		if(tail==null||tail.next==null)
			return head;
		tail.next=tail.next.next;
		return head;		
	}
	

	//8
	static Node<Integer> insert(Node<Integer> head,int p,int v)//insert at element at p index with value v.
																									//also deal with p=0;
	{	
		/*Node<Integer>	n=new Node<>(v);		
		Node<Integer> prev=head;
		Node<Integer> next=null;
		for(int i=1;i<=p-2;i++)
		{
			prev=prev.next;
		if(prev==null)
			return;
		}
		
		next=prev.next;
		prev.next=n;
		n.next=next;*/
		Node<Integer> n1=new Node<Integer>(v);
		Node<Integer> tail=head,temp=null;
		if(p==0)
		{
			n1.next=head;
			return n1;
		}
		for(int i=0;i<p-1;i++)
		{
			tail=tail.next;
		}
		if(tail==null)
			return head;
		temp=tail.next;
		tail.next=n1;
		n1.next=temp;
		return head;	
	}
	
	//9
	public static Node<Integer> input()//taking input of LL from user.
	{
		System.out.println("Enter the LinkedList data");
		Scanner scn = new Scanner(System.in);
		Node <Integer >head=null;
		Node <Integer >prev=null;
		int n=0;
		do {
			 n=scn.nextInt();
			if(n==-1)
				break;
			Node<Integer>current = new Node<>(n);
			if(head==null) {
				head=current;
				prev=current;
			}
			
			
			else 
				prev.next=current;
			prev=current;
		}while(n!=-1);
		return head;
	}
	
//10	
	static int length(Node<Integer> n)
	{
		int c=0;
		while(n.data!=-1)
		{
			System.out.println(n.data);
			c++;
			n=n.next;
		}
		return c;
	}
		
//11	
		static void increment(Node<Integer> n)
		{	
			while(n!=null)
				{
					n.data++;
					n=n.next;
				}
		}
		
//12		
		static void print(Node<Integer> head)
		{
			while(head!=null)
			{
				System.out.println(head.data);
				head=head.next;
			}
		}
		
//13		
		static Node<Integer> create()
		{
			Node<Integer>n1=new Node<Integer>(10);
			Node<Integer>n2=new Node<Integer>(20);
			Node<Integer>n3=new Node<Integer>(30);
			Node<Integer>n4=new Node<Integer>(40);
			Node<Integer>n5=new Node<Integer>(-1);
			n1.next=n2;
			n2.next=n3;
			n3.next=n4;
			n4.next=n5;
			return n1;
	}
		
//14
		static Node<Integer> insertRec(Node<Integer> head,int v,int n)
		{
			if(head==null&&n>0)			 // Note that we have written the 
				return head;						//condition n>0 as we want the code to work if we want to insert a new  
				if(n==0) {								//element to the empty LL which can be done only at pos 0
				Node<Integer>current;
				current =  new Node<>(v);
				current.next=head;
				return current;
				}
				Node<Integer> sa=	insertRec(head.next, v, n-1);
				head.next=sa;
					return head;
			}
			
//15		
			static Node<Integer> deleteRec(Node<Integer>head,int pos)
			{
				if(head==null)
					return head;;
				if(pos==0)
				{
					return head.next;
				}
				else 
				{
				Node<Integer> sa=deleteRec(head.next, pos-1);
				head.next=sa;
				return head;
				}
			}

//16
			static Node<Integer> revRec(Node<Integer> head )
			{
				/*if(head.next==null)
					return head;
				Node<Integer> sa=revRec(head.next);
				Node<Integer> t =sa;
				while(t.next!=null)                                    											--->              O(n2)
					t=t.next;
				t.next=head;
				head.next=null;
				return sa;*/
				
//				Better approach:-
				
				if(head==null||head.next==null)	//for case of LL containing 0||1 number of elements...........				//we first compare head
					return head;												//as if head is null .next 
				Node<Integer> sa=revRec(head.next);			//will give null pointer
				head.next.next=head;										//so we use shortcircuit
				head.next=null;///we do this step as head-> next and next-> thus we may get circular LL  (ERRORR!!!)
				return sa;
				
			}
			
//17
			static Node<Integer> middle(Node<Integer> head)
			{
				if (head ==null)
					return head;
				Node<Integer> s = head;
				Node<Integer> f = head;
				for(;;)
				{
					if(f.next==null||f.next.next==null)
					{
						return s;
					}
					else 
						s=s.next;
					f=f.next.next;
				}
			}
//18			
			static Node<Integer> merge(Node<Integer> head1,Node<Integer> head2)
			{
				
				/*
				 	INFO:-Merge two sorted LL into a third sorted one.....
				*/
				
				/*Node<Integer> head=null;
				Node<Integer> t=null;
				if(head1.data<=head2.data)
					{
					head=head1;
					head1=head1.next;
					}
				else 
				{
					head=head2;
					head2=head2.next;
				}
				while(head1!=null&&head2!=null)
				{
					if(head1.data<head2.data)
					{	
						head.next=head1;
						head=head1;
						head1=head1.next;
					}
					else
					{
						System.out.println(head2.data);
						head.next=head2;
						head=head2;
						head2=head2.next;
					}
				}
				return head;
				
				Note: This will give wrong output as after completion we will be 
				returning the tail of list from which we cant move towards head
				hence it is better to take a tail variable and use it for updation
				keeping the head intact
				*/
				if(head1==null)
					return head2;
				if(head2==null)
					return head1;
				Node<Integer> head=null;
				Node<Integer> tail=null;
				if(head1.data<head2.data) 										//marking head
				{
					head=head1;
					tail=head1;
					head1=head1.next;
				}
				else
				{
					head=head2;
					tail=head2;
					head2=head2.next;
				}
				while(head1!=null&&head2!=null)					//making rest of body using tail
				{
					if(head1.data<head2.data)
					{
						tail.next=head1;
						tail=head1;
						head1=head1.next;
					}
					else 
					{
						tail.next=head2;
						tail=head2;		
						head2=head2.next;
					} 
				}
				if(head1!=null)
					tail.next=head1;
				else 
					tail.next=head2;
				return head;
				
			}
			
//19			
	static Node<Integer> oddEven(Node<Integer> head)// seggregate the odd and even elements of a LL (ODD the EVEN).
		{
			Node<Integer> oh =null;
			Node<Integer> eh =null;
			Node<Integer> ot =null;
			Node<Integer> et =null;
			while(head!=null)
			{
				if(head.data%2==0)
				{
					if(eh==null)
					{	eh=head;
						et=eh;
					}
					else 
					{
						et.next=head;
						et=head;
					}
				}
				else
				{
					if(oh==null)
					{
						oh=head;
						ot=oh;
					}
					else
					{
						ot.next=head;
						ot=head;
					}
				}
				head=head.next;
			}
			
			if(oh==null)
				return eh;
			ot.next=eh;
			if(eh!=null)
			{
				et.next=null;	//<--------we are doing this because if in the original LL
			}										//the last element is odd then the last even
			return oh;						//element will be pointing to the odd elemt
		}											//forming a cycle and to prevent that we
													//did lastevenelem.next=null
	
	
//20
	static Node<Integer> traverse(Node<Integer> head,int m,int n)
	{
		/*
		 * You have been given a singly linked list of integers along
		 *  with two integers, 'M,' and 'N.' Traverse the linked list
		 *  such that you retain the 'M' nodes, then delete the next 'N' nodes.
		 *   Continue the same until the end of the linked list.
			To put it in other words, in the given linked list, you need to 
			delete N nodes after every M nodes.
		 */
		
		
		/*Node<Integer> tail=head;
		Node<Integer> temp=null;
		while(tail!=null)
		{
			for(int i=1;i<m;i++)
			{	
				if(tail==null)
					return head;
				tail=tail.next;
			}
			temp=tail;
			for(int i=0;i<=n;i++)
			{ 
				if(tail==null)
					return head;
				tail=tail.next;
			}
			temp.next=tail;
		}
		return head;*/
		
		
		
		
		
		
		Node<Integer> head1=null,tail1=null;
		if(m==0)
			return head1;
		head1=head;
		tail1=null;
		while(head!=null)
		{
			for(int i=1;i<=m;i++)
			{
				if(head==null)
					break;
				if(tail1==null)
					tail1=head;
				else
				{
					tail1.next=head;
					tail1=head;
				}
				
				head=head.next;
			}
			for(int j=1;j<=n;j++)
			{
				if(head==null)
				break;
				head=head.next;
			}
		}
		tail1.next=null; //Bery bery important line it is 
		return head1;
		
		
				
		
		
	}
//21	
		static Node<Integer> swap(Node <Integer> head ,int i,int j)
		{
			int s=i+j;
			i=i<j?i:j;
			j=s-i;
			if(head==null||i==j)
				return head;
			Node<Integer> temp=head,r1=null,r2=null,p1=null,p2=null,t=null;
			for(int k=0;temp!=null;k++)
			{
				if(k==i-1)
					p1=temp;
				else if(k==i)
					r1=temp;
				else if(k==j)
					r2=temp;
				else if(k==j-1)
					p2=temp;
				temp=temp.next;
			}
//			r1=p1.next;
//			r2=p2.next;
			if(p1==null)		// if head is to be replaced
			{
				head=r2;
				t=r2.next;
				r2.next=r1.next;
				p2.next=r1;
				r1.next=t;
			}
			else if(j-i==1)    //if adjacent
			{
				p1.next=r2;
				t=r2.next;
				r2.next=r1;
				r1.next=t;
			}
			else
			{
				p1.next=r2;
				t=r2.next;
				r2.next=r1.next;
				p2.next=r1;
				r1.next=t;
			}
			return head;
				
		}
//22	
		static Node<Integer> append(Node<Integer> head,int n)
		{
			/*int l=0;
			Node<Integer> n1=head;
			while(n1!=null)
			{
				l++;
				n1=n1.next;
			}
			Node <Integer> tail=head;
			for(int i=1;i<l-n;i++)
			{
				tail=tail.next;
			}
			Node<Integer> t=tail.next,t1=t;
			tail.next=null;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=head;
			return t1;*/
			 
//										*****Better approach*****
			Node<Integer> fast=head,slow=head,temp=null;
			if(n==0||head==null)
				return head;
			for(int i=1;i<=n;i++)
			{
				fast=fast.next;
			}
			if(fast==null)
				return head;
			while(fast.next!=null)
			{
				fast=fast.next;
				slow=slow.next;
			}
			temp=slow.next;
			slow.next=null;
			fast.next=head;
			return temp;
		}
		
		
//23		
		static Node<Integer> kRev(Node<Integer> head,int k)
		{
			/*Node<Integer>tail=head,nh=null,nt=null, t=null,th=null;
//			if(k==0||k==1)
//				return head;
			while(tail!=null)
			{
				for(int i=1;i<k;i++)
				{
					if(tail==null)
						break;;
					tail=tail.next;					..will not
				}										reverse last..
				if(tail==null)
				{
					if(nt==null)
						return null;
					nt.next=head;
					return nh;
				}
				t=tail.next;
				tail.next=null;
				th=revRec(head);	
				head.next=null;
				if(nh==null)
				{
					nh=th;
					nt=head;
				}
				else
				{
					nt.next=th;
					nt=head;
				}
				tail=t;
				head=t;
			}
			return nh;*/
			
			
			
			
			
			
			
			Node<Integer>tail=head,nh=null,nt=null, t=null,th=null;
		if(k==0||k==1)
			return head;
			while(tail!=null)
			{
				for(int i=1;i<k;i++)
				{
					if(tail.next==null)
						break;;
					tail=tail.next;
				}
				//if(tail==null)						..will reverse..
//				{
//					if(nt==null)
//						return null;
//					nt.next=head;
//					return nh;
//				}
				t=tail.next;
				tail.next=null;
				th=revRec(head);	
				head.next=null;
				if(nh==null)
				{
					nh=th;
					nt=head;
				}
				else
				{
					nt.next=th;
					nt=head;
				}
				tail=t;
				head=t;
			}
			return nh;
			/*
			 * Note:- you keep on building the LL
			 * if rev the rem-call rev on remaing and merger to final
			 * else just merge as it is...
			 */
			}
		
		
//24		
		static Node<Integer> addNumber(Node<Integer> head)
		{
			Node <Integer>rh=null,t=null;
			rh=reverse(head);
			t=rh;
			while(t!=null)
			{
				if(t.data<9)
				{
					t.data++;
					break;
				}
				else
				{
					t.data=0;
				}
				t=t.next;
			}
			if(t==null)
			{
				Node<Integer> n = new Node<Integer>(1);
				n.next=rh;
				return n;
			}
				
					return reverse(rh);
			}
		

//25
	static Node<Integer> removeKdata(Node<Integer> head,int k)//removes elemnt with data value k
	{
		
		
		Node<Integer> h=null,tail=null;
		while(head!=null)
		{
			if(head.data!=k)
			{
				if(h==null)
				{	
					h=head;
					tail=h;
				}
				else
				{
					h.next=head;
					h=head;
				}
			}
			
				head=head.next;
			
		}
		if(h==null)
		{
			Node<Integer> n =new Node<Integer>(-1);
			return n;
		}
	h.next=null;
		return tail;
	}
	
//26
	static Node<Integer> sort012(Node<Integer> head)
	{
		Node<Integer> zh=new Node<Integer>(-1);		//Dummy
		Node<Integer> oh=new Node<Integer>(-1);		//Nodes
		Node<Integer> th=new Node<Integer>(-1);		//Create
		Node<Integer> zt=zh,ot=oh,tt=th;			//.....tails....
		while(head!=null)
		{
			if(head.data==0)
			{
				zt.next=head;
				zt=head;
				head=head.next;
			}
			else if(head.data==1)
			{
				ot.next=head;
				ot=head;
				head=head.next;
			}
			else
			{
				tt.next=head;
				tt=head;
				head=head.next;
			}
		}
		//merging the created LL
		
		if(oh.next!=null)
		{
			zt.next=oh.next;
			ot.next=th.next;
			tt.next=null;
		}
		else {
			zt.next=th.next;
		tt.next=null;
		}
		zh=zh.next;
		return zh;
	        	
	    }

//27	
	public static int findNodeRec(Node<Integer> head, int n) 
	{
		/*return index of specific node*/
		
        if(head==null)
        	return -1;
        int sa = findNodeRec(head.next,n);
        if(head.data==n)
        	return 0;
        if(sa==-1)
        	return sa;
        return sa+1;
     	
	}
	
	
//28	
	static Node<Integer> BubbleSort(Node<Integer> head){
		Node<Integer> tail=head,tail1=head;
		int t=0;
		for(;tail.next!=null;tail=tail.next)
		{
			for(;tail1!=null&&tail1.next!=null;tail1=tail1.next)
			{
				if(tail1.data>tail1.next.data)
				{
					t=tail1.data;
					tail1.data=tail1.next.data;
					tail1.next.data=t;
				}
			}
			tail1=head;
		}
		return head;
	}
	
//29
	static Node<Integer> mergeSort(Node<Integer> head)
	{
		if(head.next==null)
			return head;
		Node<Integer> f=head,s=head,temp=null,nh=null,nt=null;
		while(f.next!=null&&f.next.next!=null)
		{
			f=f.next.next;
			s=s.next;
		}
			temp=s.next;
			s.next=null;
			Node<Integer> left=mergeSort(head);
			Node<Integer> right=mergeSort(temp);
			while(left!=null&&right!=null)
			{
				if(left.data<right.data)
				{
					if(nh==null)
					{
						nh=left;
						nt=left;
					}
					else
					{
						nt.next=left;
						nt=nt.next;
					}
					left=left.next;
				}
				else
				{
					if(nh==null)
					{
						nh=right;
						nt=right;
					}
					else
					{
						nt.next=right;
						nt=nt.next;
					}
					right=right.next;
				}
			}
				if(left!=null)
				{
					nt.next=left;
				}
				else
				{
					nt.next=right;
				}
				return nh;
			
			
		}
		
		
	}
	
	
