import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<>();
	    int[] arr = {0, 6, 1, 2, 3, 5, 1};
		countSequences(arr, 6, 0, list, 0);
	}
	
	static void countSequences(int[] arr, int target, int index, ArrayList<Integer> list, int sum)
	{
	    if(index >= arr.length)
	    {
	        if(sum == target)
	        {
	            System.out.println(list);
	            return;
	        }
	        return;
	    }
	    
	    
	    list.add(arr[index]);
	    sum = sum + arr[index];
	    countSequences(arr, target, index + 1, list, sum);
	    
	    list.remove(list.size() - 1);
	    sum = sum - arr[index];
	    countSequences(arr, target, index + 1, list, sum);
	    
	}
	
}
