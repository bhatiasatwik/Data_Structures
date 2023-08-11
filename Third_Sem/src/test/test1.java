package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class test1 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		Collections.swap(a, 0, 1);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
	

}
