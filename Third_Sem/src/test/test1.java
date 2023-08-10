package test;

public class test1 {
	public static void main(String[] args) {
		int a[]= {0,1,2,1,0};
		int start=0,end=a.length-1;
		int i=0;
		System.out.println(",");
		while(end>start)
		{
			if(a[i]==0)
			{
				if(a[start]==0)
				{
					start++;
				}
				else
				{
					int t=a[i];
					a[i]=a[start];
					a[start]=t;
					start++;
				}
			}
			else if(a[i]==2)
			{
				if(a[end]==2)
				{
					end--;
				}
				else
				{
					int t=a[i];
					a[i]=a[end];
					a[end]=t;
					end--;
				}
			}
			else
			{
				i++;
			}
		}
		System.out.println(",");
		for(int ig=0;ig<a.length;ig++)
		{
			System.out.println(a[ig]);
		}
	}
	

}
