import java.util.*;
public class Autobiography
{
	public static void main(String[] args) {
		System.out.println(AutobiographicalNumber("1210")); // output = 3
	}
	static int AutobiographicalNumber(String s)
	{
	    int[] arr = new int[10];
	    
	    // Iterate through the input string to check the count of each digit
	    
	    for(int i = 0;i < s.length();i++)
	    {
	        arr[s.charAt(i) - '0'] += 1;
	    }
	    
	    // check the input string with the array counts
	    
	    for(int i = 0;i < s.length();i++)
	    {
	        if(arr[i] != s.charAt(i) - '0')
	            return 0;
	    }

      // distinct counts 
	    Map<Integer, Integer> mp = new HashMap<>();
        int count_dis=0;
      
        for (int i = 0; i < arr.length; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }     
        return mp.size();
	}
}
