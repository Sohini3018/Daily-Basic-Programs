/*
Starting today from day 1 until day n, he gives i^2 coins. Return total coins.

Use = sum of squares of n natural number = n(n+1)(2n+1)/6
*/

public class TotalCoins
{
	public static void main(String[] args) {
	    int day = 3;
		System.out.println(Money(day));
	}
	
	static int Money(int day)
	{
	   return (day * (day + 1) * (2 * day + 1)) / 6;
	}
}
