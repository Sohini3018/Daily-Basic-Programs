public class Main
{
	public static void main(String[] args) {
	    int[][] max = {
            {5, 4, 3, 2},
            {2, 3, 5, 6},
            {4, 5, 6, 7},
            {1, 2, 3, 4}
        };

	                    
		for(int i = 0; i < max[0].length; i++)
		{
		    for(int j = 0; j < max.length; j++)
		    {
		        if(j > i)
		        {
		            max[i][j] = 0;
		        }
		    }
		}
		
		for(int i = 0; i < max[0].length; i++)
		{
		    for(int j = 0; j < max.length; j++)
		    {
		      System.out.print(max[i][j]);
		    }
		    System.out.println();
		}
		
		
	}
}
