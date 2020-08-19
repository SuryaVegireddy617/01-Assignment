
public class MaxDiffBtwTwoElements 
{
	public static int diff(int[] arr)
	{
		int Diff=Integer.MIN_VALUE;
		int n=arr.length;
		int Max=arr[n-1];
		
		for(int i=n-2;i>=0;i--)
		{
		if(arr[i]>Max)
		{
			Max=arr[i];
		}
		else
		{
			Diff=Integer.max(Diff,Max-arr[i]);
		}
		}
		return Diff;
		
	}
public static void main(String[] args)
{
//int[] arr= { 2, 5, 1, 7, 3, 9, 5};
int[] arr= { 2, 7, 9, 5, 1, 3, 5};

System.out.println("The Maximum difference is:"+diff(arr));
}
}
