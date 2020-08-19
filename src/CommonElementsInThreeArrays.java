package Arrays_Programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class CommonElementsInThreeArrays 
{
public static void main(String[] args)
{

int arr1[] = {1, 5, 10, 20, 40, 80};
int arr2[] = {6, 7, 20, 80, 100};
int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};

int x=0,y=0,z=0;

ArrayList al=new ArrayList();

while(x<arr1.length && y< arr2.length && z<arr3.length)
{
	if(arr1[x]==arr2[y] && arr2[y]==arr3[z])
	{
		al.add(arr1[x]);
		x++;
		y++;
		z++;
	}
	else if(arr1[x]<arr2[y])
	{
		x++;
	}
	else if(arr2[y]<arr3[z])
	{
		y++;
	}
	else {
		z++;
	}
}

ListIterator listItr = al.listIterator();

while(listItr.hasNext())
{
    System.out.println(listItr.next());
}
}
}
