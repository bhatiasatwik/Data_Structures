package hashmaps;

import java.util.ArrayList;

public class Map <K,V>{
	ArrayList<MapNode<K, V>> a;
	int count;//to count number of entries
	int bucketSize;//count number of blocks of arrayLists
	
	public Map() {
		a= new ArrayList<>();
		count=0;
		bucketSize=20;
		for(int i=0;i<bucketSize/*or bucketSize*/;i++)
		{
			a.add(null);//creating a null ArrayList of 20 size.....
		}
	}
	private int getIndex(K key)
	{
		int index=key.hashCode();
		return compress(index);
	}
	private int compress(int n)
	{
		return n%bucketSize;
	}

	public void insert(K key , V value)
	{	/*int index=getIndex(key);
		System.out.println(index);
		for(int i=0;i<20;i++)
		{
			System.out.println(a.get(i)+" "+i);
		}
		//Case 1: key already present->update value.No new node created
	MapNode<K, V> head = a.get(index);
	MapNode<K, V> temp=head; 
		System.out.println("head is "+head);
		if(head==null)
		{
			
			System.out.println("new created at null");
			MapNode<K, V> current = new MapNode<>(key,value);
			a.add(index, current);
			//System.out.println( a.get(index)+" gg ");
			count++;
			return;
		}
		while(temp.next!=null)
		{
			if(temp.key.equals(key))
			{
				temp.value=value;
				System.out.println("euqal found");
				return;
			}
			temp=temp.next;
		}
		if(head.key.equals(key))//checking the last node.
		{
			head.value=value;
			System.out.println("equal found");
		}
		else//create a new node and insert
		{
			System.out.println("new node inserted");
			MapNode<K, V> current = new MapNode<>(key,value);
			head.next=current;
			count++;
			
		}
		
		//Case 2 create a new Node.Insert to LL;
		//MapNode<K, V> current = new MapNode<>(key,value);
		*/
		
		int index=getIndex(key);
		MapNode<K, V> head=a.get(index);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				head.value=value;
				return;
			}
			head=head.next;
		}
		head=a.get(index);
		MapNode<K, V> current = new MapNode<>(key,value);
		current.next=head;
		a.set(index, current);
		count++;
	}
	public  int size()
	{
		return count;
	}
	public V getValue(K key)
	{
		int index=getIndex(key);
		MapNode<K, V> head= a.get(index);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			else
			{
				head=head.next;
			}
		}
		return null;
	}
	public void removeKey(K key)
	{
		int index=getIndex(key);
		MapNode<K, V> head=a.get(index);
		MapNode<K, V> prev=null;
		if(head.key.equals(key))
		{
			a.set(index, head.next);
			return;
		}
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				prev.next=head.next;
				return;
			}
			prev=head;
			head=head.next;
		}
	}
}
