package hashmaps;

import java.util.ArrayList;

public class revise <K,V>
{
	ArrayList<MapNode<K, V>> a;
	int size;
	int length;
	
	public revise() {
		a = new ArrayList<MapNode<K,V>>();
		size=0;
		length=20;
		for(int i=0;i<length;i++)
		{
			a.add( null);
		}
	}
	private int getIndex(K key)
	{
		return ((key.hashCode())%length);
	}
	public void insert(K key)

	{
		int i=getIndex(key);
		MapNode<K, V> m = a.get(i);
		
	}
	
}

