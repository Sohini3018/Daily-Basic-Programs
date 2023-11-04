/*
sort even then odd relative order must be same
*/

import java.util.*;
public class SortEvenOdd
{
	public static void main(String[] args) {
	    int size = 7;
	    int[] arr = {10,3,6,4,5,0,7};
		sort(arr, size);
	}
	
	static void sort(int[] arr, int size)
	{
	    ArrayList<Integer> evenList = new ArrayList<>();
	    ArrayList<Integer> oddList = new ArrayList<>();
	    
	    for(int i = 0;i<size;i++)
	    {
	        if(arr[i] % 2 == 0)
	        {
	            evenList.add(arr[i]);
	        }
	        else
	        {
	            oddList.add(arr[i]);
	        }
	    }
	    
	    for(int i = 0;i<evenList.size();i++)
	    {
	        System.out.print(evenList.get(i) + " ");
	    }
	    for(int i = 0;i<oddList.size();i++)
	    {
	        System.out.print(oddList.get(i) + " ");
	    }
	    
	}
}
