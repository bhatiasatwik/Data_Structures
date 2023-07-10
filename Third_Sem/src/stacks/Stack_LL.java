package stacks;

import LinkedList.*;
public class Stack_LL <T>{
	
	Node<T> head;
	Node<T> tail;
	int size;
	
	/*void push(T elem)
	{
		Node<T> n1=new Node<T>(elem);
		if(head==null)
		{
			head=n1;
			tail=n1;
		}
		else
		{
			tail.next=n1;
			tail=n1;			
		}
			
	}
	
	T top()
	{
		if(tail==null)
			return null;
		return tail.data;
	
	
	
	
	T pop()
	{
		T temp;
		if(head==null)
			return null;
		Node<T> t=head;
		if(t.next==null)
		{
			temp=t.data;
			head=null;
			tail=null;
			return temp;
		}
		while(t.next.next!=null)
		{
			t=t.next;
		}
		temp=t.next.data;
		t.next=null;
		tail=t;
		return temp;
	}	
		
		 boolean isEmpty()
		{
			return head==null;
		}
		 
		 int length()
		 {
			 int l=0;
			 Node t=head;
			 while(t!=null)
			 {
				 t=t.next;
				 l++;
			 }
			 return l;
		 }*/
	
	
	void push(T data)
	{
		Node<T> n=new Node<>(data);
		if(head==null)
		{
			head=n;
			tail=n;
		}
		else
			
		{
			n.next=head;
			head=n;
		}
		size ++;
		
	}
	
	T pop()
	{
		if(head==null)
			return null;
		T temp=head.data;
		head=head.next;
		size--;
		return temp;
	}
	
	boolean isEmpty()
	{
		return head==null;
	}
	
	int size()
	{
		return size;
	}
	
	T top()
	{
		if(head==null)
			return null;
		return head.data;
	}
	}

