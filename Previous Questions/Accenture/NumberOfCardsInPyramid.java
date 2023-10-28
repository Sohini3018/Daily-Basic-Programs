/*
level 1 pyramid = 2 cards / \
level 2 pyramid =     /_\    2 + 5 more
                    / \ / \

How many total cards are in nth level pyramid?                   
                      
*/

public class NumberOfCardsInPyramid
{
	public static void main(String[] args) 
  {
      System.out.println(CardsPyramid(3));
  }
  static int CardsPyramid(int n)
  {
      int cards = 0;
      int level = 1;
      while(level <= n)
      {
          cards = cards + level * 2 + (level-1);
          level++;
      }
      return cards%1000007;
  }
}
