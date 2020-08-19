package Arrays_Programs;

public class ThirdLargestElementInArray 
{
public static void main(String[] args)
{
	int [] arr = new int [] {6, 8, 1, 9, 2, 1, 10};	
	//int [] arr = new int [] {6, 8, 1, 9, 2, 1, 10, 12};	
	//int [] arr = new int [] {6};	
	int k=3;
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		if(i==k-1)
		{
			System.out.println(k+"--> Largest in the Array is"+arr[i]);
		}
		/*else
		{
			System.out.println("Invalid Input, array size is less than"+k);
		}*/
	}
	System.out.println("-------------------------");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
}
}
