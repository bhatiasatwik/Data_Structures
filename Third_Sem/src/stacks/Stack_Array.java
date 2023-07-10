package stacks;

public class Stack_Array {
	private int top;   // 	  it should be fuk'in private
	private int a[]; //  this array should be internal
	
	public Stack_Array()  //constructor
	{
		a=new int[1];
		top=-1;
	}
	
	public void push(int n) throws StackFullException
	{
		++top;
		if(top==a.length-1)
			{
			/*
			//		throw exception
			StackFullException e = new StackFullException();
			throw e;
//			or throw new StackFullException();
			*/
			increasecapacity();
			}
			
		a[top]=n;
	}
	
	public int pop()
	{
		return a[top--];
	}
	
	public int top()
	{
		if(top==-1)
			return -1;
		return a[top];
	}
	
	public int size()
	{
		return top+1;
	}
	
	public boolean isEmpty()
	{
		/*if(top==-1)
			return true;
		return false;*/
		return top==-1;
		
	}
	
	void increasecapacity()
	{
		int t[]=a;
		a=new int[2*t.length];
		for(int i=0;i<t.length;i++)
			a[i]=t[i];
	}
	
	
	
}
