package Arrays_Programs;

public class SecondMinAndSecondMax 
{
public static void main(String[] args) 
{
int temp;
int [] arr = new int [] {1, 2, 5, 9, 6, 4, 7, 2};

/*for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]<arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
System.out.println(" ");
System.out.println("Second largest element in the givne array is::"+arr[1]);

System.out.println("-----------------------------------");
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
System.out.println(" ");
System.out.println("Second smallest element in the givne array is:"+arr[1]);*/

int largest=Integer.MIN_VALUE;
int second_largest=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]>largest)
	{
		second_largest=largest;
		largest=arr[i];
	}
	else if(arr[i]>second_largest && arr[i]!=largest)
	{
	second_largest=arr[i];	
	}
}
if(second_largest==Integer.MIN_VALUE)
{
	System.out.println("There is second largest element in the list");
}
else
{
	System.out.println("Second Largest element is:"+second_largest);
}



System.out.println("---------------------------------------------");

int smallest=Integer.MIN_VALUE;
int second_smallest=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]<smallest)
	{
		second_smallest=smallest;
		smallest=arr[i];
	}
	else if(arr[i]<second_smallest && arr[i]!=smallest)
	{
		second_smallest=arr[i];	
	}
}
if(second_smallest==Integer.MIN_VALUE)
{
	System.out.println("There is second smallest element in the list");
}
else
{
	System.out.println("Second smallest element is:"+second_smallest);
}


}
}
