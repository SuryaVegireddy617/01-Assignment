package Arrays_Programs;

public class MinAndMaxInArray
{
public static void main(String[] args)
{
	int [] arr = new int [] {1, 2, 5, 5, 6, 6, 7, 2};	
	//int [] arr = new int[]{ 6, 8, 1, 9, 2, 1, 10, 12};
	
	int Min=arr[0];
	int Max=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(Min>arr[i])
		{
			Min=arr[i];
		}
	}
	System.out.println("Minimum element is the given array is:"+Min);
	
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>Max)
		{
			Max=arr[i];
		}
	}
	System.out.println("Maximum element is the given array is:"+Max);
}
}
