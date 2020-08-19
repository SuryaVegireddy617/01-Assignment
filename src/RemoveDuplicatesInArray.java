package Arrays_Programs;

import java.util.Arrays;

public class RemoveDuplicatesInArray 
{
	public static void removeDuplicates(int arr[])
	{
		 int[] temp=new int[arr.length];
		 System.out.println(temp.length);
		 int k=0;
		 Boolean found=false;
		 for(int i=0;i<arr.length;i++)
		 {
			 found=false;
			 if(i==0)
			 {
				 temp[k++]=arr[i];
			 }
			 else
			 {
				 for(int j=0;j<k;j++)
				 {
					 if(temp[j]==arr[i])
					 {
						 found=true;
					 }
				 }
				 if(!found)
				 {
					 temp[k++]=arr[i];
				 }
			 }
		 }
		 for(int l=0;l<k;l++)
		 {
			 System.out.println(temp[l]+" ");
		 }
	}
 public static void main(String[] args)
 {
	 //int [] arr = new int [] {1,5,6,8,9,3,4,2,5,8,9,1};
	 int [] arr = new int [] {1, 2, 5, 5, 6, 6, 7, 2};
	 
	 System.out.println(arr.length);
	
	 //RemoveDuplicatesInArray RUIA=new RemoveDuplicatesInArray();
	 removeDuplicates(arr);
 }
}
