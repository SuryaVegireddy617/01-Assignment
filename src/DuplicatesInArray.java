package Arrays_Programs;

public class DuplicatesInArray 
{
public static void main(String[] args) 
{
	 int [] arr = new int [] {1, 2, 5, 5, 6, 6, 7, 2};  
	 //int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
	 
	 for(int i=0;i<=arr.length;i++)
	 {
		 for(int j=i+1;j<=arr.length-1;j++)
		 {
			 if(arr[i]==arr[j])
			 {
				 System.out.println(arr[i]);
			 }
		 }
		 
		  
	 }
	 
}
}
