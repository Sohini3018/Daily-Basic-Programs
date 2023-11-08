import java.util.*;
public class MinimumOccBwXandY
{
	public static void main(String[] args) {
	    int[] arr = {10, 3, 2, 4, 5, 6, 9, 7, 3};
		System.out.println(MinimumNumberOfIntegers(arr, 9, 3, 6));
	}
	
	static int MinimumNumberOfIntegers(int[] arr, int n, int x, int y)
	{
	    if(arr.length == 0)
	        return 0;
	    
	    int count = n; // actually we need a max integer value.
	    int index_x = -1;
	    int index_y = -1;
	    boolean flag_x = false;
	    boolean flag_y = false;
	    
	    for(int i = 0; i < n ; i++)
	    {
	       // if(arr[i] == x)
	       // {
	       //     int j = i+1;
	       //     int curr_count = 0;
	       //     while(arr[j] != y)
	       //     {
	       //         curr_count++;
	       //         j++;
	       //     }
	       //     if(curr_count < count)
	       //     {
	       //         count = curr_count;
	       //     }
	       // }
	        
	        
	       // if(arr[i] == y)
	       // {
	       //     int j = i+1;
	       //     int curr_count = 0;
	       //     while(arr[j] != x)
	       //     {
	       //         curr_count++;
	       //         j++;
	       //     }
	       //     if(curr_count < count)
	       //     {
	       //         count = curr_count;
	       //     }
	       // }
	       
	       if(i == n - 1 && (index_x == -1 || index_y == -1))
	       {
	           return -1;
	       }
	       
	       if(arr[i] == x)
	       {
	           index_x = i;
	           flag_x = true;
	       }
	       
	       if(arr[i] == y)
	       {
	           index_y = i;
	           flag_y = true;
	       }
	       
	       if(flag_x == true && flag_y == true)
	       {
	           count = Math.min(Math.abs(index_y - index_x) - 1, count);
	           
	           // down both the flag to check other occurences. 
	           
	           flag_x = false;
	           flag_y = false;
	           i--; 
	           // beacouse the index is already checked and i will go to next index. But for checking the next
	           // occurence we will need this index again. The index in middles will be checked twice actually.
	       } 
	    }
	    return count;
	}
}
