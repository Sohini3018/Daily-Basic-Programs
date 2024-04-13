import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {1,2,0,5,0,0,6};
		
// 		ArrayList<Integer> temp = new ArrayList<>();

        int[] temp = new int[arr.length];
        
        Arrays.fill(temp, 0);
		
// 		int cnt = 0;
		int j = 0;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i] > 0)
		    {
		      //  temp.add(arr[i]);
		      temp[j] = arr[i];
		      j++;
		    }
		  //  else{
		  //      cnt++;
		  //  }
		}
// 		for(int i = 0;i<cnt;i++)
// 		{
// 		    temp.add(0);
// 		}
		
// 		for(int i=0;i<temp.size();i++)
        for(int i=0;i<temp.length;i++)
		{
		  //  System.out.print(temp.get(i));
		  System.out.print(temp[i]+" ");
		}
		
	}
}
