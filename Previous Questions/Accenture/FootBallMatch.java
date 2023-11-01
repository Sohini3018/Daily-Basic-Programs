/*
input first line - an integer that says number of goals
then team names for each goal like - 
3
teamA
teamB
teamA

so winner is teamA as it has scored 2 goals. There is no tie for sure.

*/

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class FootBallMatch
{
  public static void main (String[]args)
  {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String[] team = new String[n];
      for(int i = 0;i < n;i++)
      {
          team[i] = sc.next();
      }
      findWinner(n, team);
  }

  static void findWinner (int n, String[] team)
  {
    int tA = 0;
    int tB = 0;

    for(int i = 0; i < n; i++)
    {
	    if (team[i].equals("teamA"))
	        tA++;
	    else
	        tB++;
    }
    System.out.println("teamA ="+tA+"teamB = "+tB);

    if (tA > tB)
      System.out.println("teamA");
    else
      System.out.println("teamB");
  }
}
