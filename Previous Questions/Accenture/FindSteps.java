public class FindSteps
{
	public static void main(String[] args) {
		System.out.println(findSteps(10000));
	}
	
	static int findSteps(int n)
	{
	   // int i = 2;
	   // int steps = Math.abs(n - 1);
	    
	   // while(true)
	   // {
	   //     int curr_steps = Math.abs(i * i - n);
	   //     if(curr_steps >= steps)
	   //         return steps;
	   //     else
	   //     {
	   //         steps = curr_steps;
	   //         i++;
	   //     }
	   // }
	   
	   double number = n;
	   
	   if((int)Math.sqrt(number) == n)
	    return 0;
	   
	   int lesser_sq_num_root = (int)Math.sqrt(number);
	   int lesser_sq_num = lesser_sq_num_root * lesser_sq_num_root;
	   
	   int greater_sq_num_root = lesser_sq_num_root + 1;
	   int greater_sq_num = greater_sq_num_root * greater_sq_num_root;
	   
	   
	   
	   return Math.min(Math.abs(lesser_sq_num - n), Math.abs(greater_sq_num - n));
	}
}
