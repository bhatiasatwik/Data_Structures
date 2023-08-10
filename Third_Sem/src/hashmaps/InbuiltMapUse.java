package hashmaps;

import java.util.Arrays;
import java.util.*;
import java.util.Set;


public class InbuiltMapUse {

//1
		public static ArrayList<Integer> RemoveDuplicates(int[] arr,int n)
		{
			HashMap<Integer,Boolean> h = new HashMap<Integer, Boolean>();
			ArrayList<Integer> q= new ArrayList<Integer>();
			 helper(arr,0,n-1,h,q);
			 return q;
		}
		private static void helper(int a[],int start,int end,HashMap<Integer, Boolean>map,ArrayList<Integer> sol)
		{
			if(start>end)
				return ;
			if(map.containsKey(a[start])==false)
			{
				sol.add(a[start]);
				map.put(a[start],true);
			}
			helper(a, start+1, end, map,sol);
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------------
		
//2
		public static int MaxFreq(int a[])
		{
			//You are given an array of integers that contain numbers in random order. 
			//Write a program to find and return the number which occurs the maximum times in the given input.
			//If two or more elements are having the maximum frequency, return the element which occurs in the array first.
			
			int l=a.length;
			HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();
			for(int i=0;i<l;i++)
			{
				if(h.containsKey(a[i]))
				{
					h.put(a[i],h.get(a[i])+1);
				}
				else
				{
					h.put(a[i],1);
				}
			}//creating the frequency map.
			
			//creating the iterator
			int Maxele=a[0],Maxfreq=1;
			for(int i=0;i<a.length;i++)
			{
				if(h.get(a[i])>Maxfreq)
				{
					Maxele=a[i];
					Maxfreq=h.get(a[i]);
				}
			}
			return Maxele;
		}
//------------------------------------------------------------------------------------------------------------
//3
		public static void PrintIntersection(int a[],int b[])
		{
			//step 1
			//create a map of all the elements of array 1.
			HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
			for(int i=0;i<a.length;i++)
			{
				int k=a[i];
				if(h.containsKey(k))
				{
					h.put(k, h.get(k)+1);
				}
				else
				{
					h.put(k, 1);
				}
			}
			//step 2
			//while iterating the second array check each element against the keys of map if present 
			//print the elem and decrease the freq if f==1, delete the key..............
			for(int i=0;i<b.length;i++)
			{
				int k=b[i];
				if(h.containsKey(k))
				{
					System.out.println(k);
					if(h.get(k)==0)
						h.remove(k);
					else
					h.put(k, h.get(k)-1);
				}
			}
		}
//------------------------------------------------------------------------------------
//4
		public static int PairSum(int a[])
		{
			//Given a random integer array A of size N. Find and print the count of pair of 
			//elements in the array which sum up to 0.
			//Note: Array A can contain duplicate elements as well.
			HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();
			int c=0;
			for(int i=0;i<a.length;i++)
			{
				int k=a[i];
				if(h.containsKey(k))
				{
					h.put(k, h.get(k)+1);
				}
				else
				{
					h.put(k, 1);
				}
			}
			for(int i=0;i<a.length;i++)
			{
				int k=a[i];
				if(k!=0)
				{
					if(h.containsKey(-k))
					{
						c=c+(h.get(k)*h.get(-k));
					}
				}
				else
				{
					//in case of zeroo apply
					//the combination formula
					if(h.containsKey(k))//after first zero all zeros will be removed hence use this condition
					{						//to deal with upcoming zeros of the array and prevent null pointer
						int z=h.get(k);
						int comb=(z*(z-1))/2;//combination formula. 
						c=c+comb;
					}
				}
				h.remove(k);
				h.remove(-k);
			}
			return c;
		}
//-----------------------------------------------------------------------------------------------------------------------------------------------
//5
		public static String uniqueChar(String str)
		{
			//Given a string S, you need to remove all the duplicates. 
			//That means, the output string should contain each character only once. 
			//The respective order of characters should remain same, as in the input string.
			HashMap<Character,Integer> h = new HashMap<Character, Integer>();
			String ans="";
			for(int i=0;i<str.length();i++)
			{
				char s = str.charAt(i);
				if(!h.containsKey(s))
				{
					ans=ans+s;
					h.put(s, 0);
				}
			}
			return ans;
		}
//--------------------------------------------------------------------------------------------------------------------------------------
//6
		public static ArrayList<Integer> longestConsecutive(int a[])
		{
			/*You are given an array of unique integers that contain numbers in random order.
			 *  You have to find the longest possible sequence of consecutive numbers using the
			 *   numbers from given array.
			 *   You need to return the output array which contains starting and ending element.
			 *    If the length of the longest possible sequence is one, then the output array must contain only single element.
			 */
			ArrayList<Integer> ans = new ArrayList<Integer>();
			
			return ans;

		}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
//7
		public static int getPair(int a[],int diff)
		{
			//You are given with an array of integers and an integer K.
			//You have to find and print the count of all such pairs which have difference K.
			//Note: Take absolute difference between the elements of the array.
			//create frequency array.
			
			/*approach-
			 * since we have to consider the absolute value ,we will
			 * have to take +k and -k both hence approach will be 
			 * slight diff from sum 0 problem..................
			 */
			
			
			//freq map created......
			
			//try 1
			/*
			HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				int k=a[i];
				if(!h.containsKey(k))
				{
					h.put(k, 1);
				}
				else
				{
					h.put(k, h.get(k)+1);
				}
			}
			if(diff!=0)
			{
				for(int i=0;i<a.length;i++)
				{	int b=a[i];
					int a2=b+diff;
					int a1=b-diff;
					if(h.containsKey(a1))
					{
						count+=h.get(b)*h.get(a1);
					}
					if(h.containsKey(a2))
					{
						count+=h.get(b)*h.get(a2);
					}
					h.put(b,0);
				}
			}
			else{
				for(int i=0;i<a.length;i++)
				{
					if(h.containsKey(a[i])){
						int o=h.get(a[i]);
					count+=(o*(o-1))/2;
					h.remove(a[i]);

				}
			}
			}
			
		return count;*/
			
			//try2
			HashMap<Integer, Integer>h = new HashMap<Integer, Integer>();
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				int k=a[i];
				int p1=k+diff;
				int p2=k-diff;
				if(h.containsKey(p1))
				{
						
					count+=h.get(p1);
				}
				if(h.containsKey(p2)&&p1!=p2)
				{
					count+=h.get(p2);
				}
				if(h.containsKey(k))
				{
					h.put(k, h.get(k)+1);
				}
				else
				{
					h.put(k, 1);
				}
			}	
		return count;
		}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
//8
		public static int longestLength(int a[])
		{
			/*
			 * Given an array consisting of positive and negative integers,
			 *  find the length of the longest subarray whose sum is zero.
			 */
			
			//thinking
			/*
			 * we know that if sum of a subarray is 0 then if we are keeping
			 * sum of elements to left of current we will get a repeat in sum 
			 * and we'll use this fact to solve our problem
			 */
			HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();//sum->index
			int sum=0;
			int l=0;
			int ml=0;
			for(int i=0;i<a.length;i++)
			{
				sum+=a[i];
				if(sum==0)
				{
					l=i+1;
				}
				else {
					if(h.containsKey(sum))
					{
						l=i-h.get(sum);
					}
					else
					{
						h.put(sum, i);
					}
				}
				ml=l>ml?l:ml;
			}
			if(sum==0)
				return a.length;
			return ml;
		}
//---------------------------------------------------------------------------------------------------------------------------------------------------------
//9
		public static int smallestLength(int a[])
		{
			//same ques but smallest length is to be returned
			HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();//sum->index
			int sum=0;
			int l=a.length;
			int ml=a.length;
			for(int i=0;i<a.length;i++)
			{
				int k=a[i];
				sum+=k;
				if(sum==0)
				{
					l=i+1;
				}
				else
				{
					if(h.containsKey(sum))
					{
						l=i-h.get(sum);
					}
				}
				h.put(sum, i);
				if(l<ml)
				{
					ml=l;
				}
			}
			if(sum==0)
				return Math.min(a.length, ml);
			return ml;
		}
//-------------------------------------------------------------------------------------------------------------------------
//									Driver Code
	public static void main(String[] args) {
		/*int a[]= {1,2,3,2,1,2,3,5,1,6,6};
		int n=11;
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar=RemoveDuplicates(a, n);
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}*/
		int a[]= {1,2,120,95,-75,-30,-60,-50,12,-12,1200,1300};
		//int b[]= {2,4,6,2,8,10,12,15};
		System.out.println(smallestLength(a));
		//System.out.println(MaxFreq(a));
	}
}
