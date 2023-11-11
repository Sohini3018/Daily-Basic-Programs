/*
You, as the store manager, want to help each customer get the maximum number of candies they can buy without exceeding their budget. Your task is to find out how many candies each customer can purchase with their given budget.

Input:

.A list of candy prices in the order they are arranged on the shelves.

An integer representing the budget of the customer.

Output:

. Return the maximum number of candies the customer can buy without exceeding their budget.
*/

import java.util.*;
public class FindCandies
{
	public static void main(String[] args) {
	    int[] arr = {5, 2, 3, 7};
	    int b = 5;
		System.out.println(candyNum(arr, b));
	}
	
	static int candyNum(int[] arr, int b)
	{
	    int cost = 0;
	    int candy = 0;
	    
	    Arrays.sort(arr);
	    
	    for(int i = 0; i < arr.length; i++)
	    {
	        if(cost + arr[i] <= b)
	        {
	            cost = cost + arr[i];
	            candy++;
	        }
	        else
	        {
	            break;
	        }
	    }
	    return candy;
	}
}
