package Arrays_Programs;

public class SmallestPairSumInArray 
{
	static int smallest_pair(int[] a, int n) 
	{ 
	    int min =  Integer.MAX_VALUE, secondMin =  Integer.MAX_VALUE; 
	    for (int i = 0; i < n; i++)  
	    { 
	        if (a[i] < min) 
	        { 
	            secondMin = min; 
	            min = a[i]; 
	        } 
	   
	        else if ((a[i] < secondMin) && a[i] != min) 
	        {
	            secondMin = a[i]; 
	        }
	    } 
	     
	    return (secondMin + min); 
	} 
	  
	public static void main(String[] args) 
	{ 
	    int[] arr = { 1, 7, 5, 9, 6 }; 
	    int n = arr.length; 
	  
	    System.out.println(smallest_pair(arr, n)); 
	} 
}
