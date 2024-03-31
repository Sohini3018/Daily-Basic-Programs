// Given an array arr[] of distinct integers of size N, the task is to print the count of greater elements on the left side of each array element.

// Examples :

// Input: arr[] = {12, 1, 2, 3, 0, }
// Output: 0 1 1 1 4
// Explanation:
// For index 0, no greater element exists on the left side.
// For index 1, {12} is greater element on the left side.
// For index 2, {12} is greater element on the left side.
// For index 3, {12} is greater element on the left side.
// For index 4, {12, 1, 2, 3} are greater elements on the left side.
// Therefore, the output is 0 1 1 1 4.

// Input: arr[] = {5, 4, 3, 2, 1}
// Output: 0 1 2 3 4

public class Main
{
	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 6, 0};
		int res = countNums(arr);
		System.out.print(res);
	}
	
	
	static int countNums(int[] arr)
	{
	    int max = arr[0];
	    int count = 1;
	    
	    for(int i = 0; i < arr.length; i++)
	    {
	        if(arr[i] > max)
	        {
	            count++;
	            max = arr[i];
	        }
	    }
	    return count;
	}
}

// Output = 3
