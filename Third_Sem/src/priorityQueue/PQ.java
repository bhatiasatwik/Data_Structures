package priorityQueue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class PQ <T>{
	/*ArrayList<Integer> a;
	
	public PQ()
	{
		a= new ArrayList<Integer>();
	}
	void insert(int n)
	{
		System.out.println("call");
		a.add(n);
		if(a.size()==1)
			return;
		int ci=a.size()-1;
		int pi=(ci-1)/2;
		if(a.get(pi)<a.get(ci))
		{
			for(int i=0;i<a.size();i++)
			{
				System.out.println(a.get(i));
			}
			return;
		}
		while(ci!=0)
		{
			if(a.get(pi)>a.get(ci))
			{
				int t=a.get(pi);
				a.set(pi,a.get(ci));
				a.set(ci, t);
				ci=pi;
				pi=(ci-1)/2;	
			}
		}
		System.out.println(a.size()+"s");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
*/
	ArrayList<PQ_element<T>> a;
	int size;
	public PQ() {
		a=new ArrayList<PQ_element<T>>();
		size=0;
	}
	void insert(T data,int priority)
	{
		
		size++;
		PQ_element<T> e = new PQ_element<T>(data, priority);
		a.add(e);
		if(a.size()==1) {
			
			return;}
		int ci=a.size()-1;
		int pi=(ci-1)/2;
		if(a.get(pi).priority<a.get(ci).priority)
		{
			
			return;
		}
		while(ci!=0)
		{
			if(a.get(pi).priority>a.get(ci).priority)
			{
				PQ_element<T> t=a.get(pi);
				a.set(pi,a.get(ci));
				a.set(ci, t);
				ci=pi;
				pi=(ci-1)/2;	
			}
			else {
				return ;
			}
		}
	}
	T removeMin()
	{
		size--;
		if(a.size()==0)
			return null;
		else if (a.size()==1)
			return a.remove(0).data;
		Collections.swap(a,0, a.size()-1);
		T r=a.get(a.size()-1).data;
		a.remove(a.size()-1);
		//swapping.............
		int current=0;
		int child1=2*current+1;
		int child2=child1+1;
		while(child2<a.size())
		{
			int rep=a.get(child2).priority>a.get(child1).priority?child1:child2;
			if(a.get(current).priority>a.get(rep).priority)
			{
				Collections.swap(a,current,rep);
			}
			current=rep;
			child1=2*current+1;
			 child2=child1+1;
		}
		
		if(child1>=a.size()) 
		{
			return r;
		}
		if(a.get(current).priority>a.get(child1).priority)
		{
			Collections.swap(a, child1,current);
		}
		
		return r;
	}
	T getMin()
	{
		return a.get(0).data;
	}
	int size()
	{
		return size;
	}
	boolean isEmpty()
	{
		return size==0;
	}
}
