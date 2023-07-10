package stacks;

import java.util.Stack;
public class practise
{
	public static void main(String[] args) {
		System.out.println(min(")))((("));
	}
	static int min(String s)
	{
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
		return c;
	}
	
}

