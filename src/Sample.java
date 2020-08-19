package Arrays_Programs;

public class Sample
{
public static void main(String[] args)
{
	 int[] arr = { 1, 7, 3, 9, 6 }; 
	  int n = arr.length; 
	  int min =  Integer.MAX_VALUE, secondMin =  Integer.MAX_VALUE; 
	    for (int i = 0; i < n; i++)  
	    { 
	        if (arr[i] < min) 
	        { 
	            secondMin = min; 
	            min = arr[i]; 
	        } 
	   
	        else if ((arr[i] < secondMin) && arr[i] != min) 
	        {
	            secondMin = arr[i]; 
	        }
	    } 
	     System.out.println(secondMin + min);
	    //return (secondMin + min); 	
}
}
