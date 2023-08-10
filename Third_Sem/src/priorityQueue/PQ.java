package priorityQueue;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PQ {
	ArrayList<Integer> a;
	
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

}
