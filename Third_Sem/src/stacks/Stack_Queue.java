package stacks;

import java.util.Queue;
import java.util.LinkedList;

public class Stack_Queue {
	Queue<Integer> q1;
	Queue<Integer>q2;
	
	public Stack_Queue() 
	{	
		q1=new LinkedList<Integer>();
		q2=new LinkedList<Integer>();
	}
	int size()
	{
		return q1.size();
	}
	
	boolean isEmpty()
	{
		return q1.isEmpty();
	}
	
	void push(int n)
	{
		q1.add(n);
	}
	
	int top()
	{
		if(q1.size()==0)
			return -1;
		while(q1.size()!=1)
		{
			q2.add(q1.poll());
		}
		int t = q1.peek();
		q2.add(q1.poll());// ...VERY IMP LINE...
		while(!q2.isEmpty())
		{
			q1.add(q2.poll());
		}
		return t;
	}
	
	int pop()
	{
		if(q1.size()==0)
			return -1;
		while(q1.size()!=1)
		{
			q2.add(q1.poll());
		}
		int t = q1.poll();
		while(!q2.isEmpty())
		{
			q1.add(q2.poll());
		}
		return t;
	}

}
