/*
Leetcode Link - 
*/

public class HappyNumber
{
  public static void main(String[] args)
  {
    System.out.println(isHappy(19)); // true
  }

 static boolean isHappy(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(true)
        {
            int num = n;
            int sum = 0;
            while(num != 0)
            {
                int last_dig = num % 10;
                sum = sum + last_dig * last_dig;
                num = num / 10;
            }
            
            n = sum;

            if(n == 1)
                return true;
            else if(list.contains(n)) // it means a loop has been created!
                return false;
            else
                list.add(n);
        }    
    }
}
