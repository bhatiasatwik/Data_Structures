package stacks;


import java.util.Stack;

public class Stack_ques {
	
//	1).
	
	public static boolean balancedParanthesis(String s)
	{
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='(')
			{
				stack.push(s.charAt(i));
			}
			else	if(s.charAt(i)==')') {
				if(stack.isEmpty())							// to deal with {}}
					return false;
				if(stack.pop()!='(')
					return false;
			}
				else if(s.charAt(i)=='}') {
					if(stack.isEmpty())						// to deal with {}}
						return false;
					if(stack.pop()!='{')
						return false;
				}
					else if(s.charAt(i)==']') {
						if(stack.isEmpty())						
							return false;						// to deal with {}}
						if(stack.pop()!='[')
							return false;
					}
		}
		return stack.isEmpty();   // to deal with {{}
	
	}
	
	
	static boolean redundant(String s)//check for redundant brackets
	{
		int c=0;
		Stack<Character> s1= new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			s1.push(s.charAt(i));
		}
		while(!s1.isEmpty())
		{
			if(s1.peek()=='(')
			{
				if(c==0)
					return true;
				c=0;
			}
			if(s1.peek()=='+'||s1.peek()=='-'||s1.peek()=='*'||s1.peek()=='/'||s1.peek()=='%')
				c++;
			s1.pop();
		}
		return false;
	}
	
	
//	2)....
	static void reverseStack(Stack<Integer> s,Stack<Integer> h)
	{
		
		int t=0;
		if(s.isEmpty())
			return;															//we know that we need total of 3 stacks.
			t=s.pop();														//so what sw do is to utilise the given two stack
			reverseStack(s, h);										// and use recursion's intrinsic stack 😜😚																				//HEHEHE
			while(!s.isEmpty())
			{
				h.push(s.pop());
			}
			s.push(t);
			while(!h.isEmpty())
			{
				s.push(h.pop());
			}
		
	}
	
	
	public static int minrev(String s) //minimum reversal req to balance 
	{
		/*
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				stack.push('(');
			}
			else
				stack.pop();
		}
		if(stack.size()%2!=0)
			return -1;
		return(stack.size()/2);
		
		
		
		Stack<Character> open=new Stack<>();
		Stack<Character> close=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				open.push('(');
			}
			else
			{
				close.push(')');
			}
		}
		while(!open.isEmpty()&&!close.isEmpty())
			{
				open.pop();
				close.pop();
			}
		if(open.isEmpty())
			{
				if(close.size()%2!=0)
					return -1;
				else
					return(close.size()/2);
				}
		else
		{
			if(open.size()%2!=0)
				return -1;
			else
				return(open.size()/2);*/
		
//-----------------------------------------------------		
		/*
		 int c=0;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
				stack.push(s.charAt(i));
			else
				if(stack.isEmpty()==false&&stack.peek()=='(')
				stack.pop();
				else
					stack.push(s.charAt(i));
		}
		if(stack.size()%2!=0)
			return -1;
		while(!stack.isEmpty())
		{
			if(stack.pop()==stack.peek())
				{
					c++;
					stack.pop();
				}
			else
			{
				c=c+2;
				stack.pop();
				System.out.println("J");
			}
		}
		return c;*/
		Stack<Character> s1 = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				s1.push('(');
			}
			else if(s.charAt(i)==')')
			{
				if(s1.isEmpty()||s1.peek()==')')
				{
					s1.push(')');
				}
				else
					s1.pop();
			}
		}
		if(s1.size()%2!=0)
			return -1;
		int step=0;
		while(!s1.isEmpty())
		{
			if(s1.pop()==s1.pop())
			{
				step=step+1;
			}
			else
				step=step+2;
		}
		return step;
		
		}
	
	static void stockSpan()
	{
			 	int price[]= {100, 80, 60, 70, 60, 75, 85,110};
				Stack<Integer> s = new Stack<>();
			 	int span[] = new int[price.length];
			 	span[0]=1;
			 	s.push(0);
			 	for(int i=1;i<span.length;i++)
			 	{
			 		while(s.isEmpty()!=true&&price[i]>price[s.peek()])
			 		{
			 			s.pop();
			 		}
			 		if(s.isEmpty()) {
			 			span[i]=i+1;
			 		}
			 		else
			 		{
			 			span[i]=i-s.peek();
			 		}
			 		s.push(i);
			 	}
			for(int i=0;i<span.length;i++)
				System.out.println(span[i]);
	}	
	
	
	static int validLength(String s)
	{
		int l=0;
		int o=0,c=0,k=0, r=0;
		Stack<Character> s1 = new  Stack<>();
		for(;k<s.length()-1;k++)
		{
			if(s.charAt(k)=='('&&s.charAt(k+1)==')')
				{r=2;
				break;
				}
		}
		for(int i=k+2;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
				{
					s1.push('(');
					o++;				
				}
			else
			{
				if(!s1.isEmpty())
				{
					s1.pop();
					c++;
				}
			}
			if(o==c)
			{ o=0;
			c=0;
				r+=2;
			}
		}
		return r;
				
				
					
			}

		
	
	
	public static void main(String[] args) {
//		Stack<Integer> s1=new Stack<>();
//		Stack<Integer> h=new Stack<>();
//		s1.push(1);
//		s1.push(2);
//		s1.push(3);
//		s1.push(4);
//		reverseStack(s1, h);
//		while(!s1.isEmpty())
//		{
//			System.out.println(s1.pop());
//		}
//		System.out.println(minrev("))(("));
//		System.out.println(balancedParanthesis("{{}{}}"));
//		System.out.println(redundant("()(A+B))"));
	System.out.println(validLength(""));
//		stockSpan();
	}
}
