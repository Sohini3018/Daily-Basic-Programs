import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Rows: ");
        int row=sc.nextInt();

        System.out.println("Enter number of columns: ");
        int col=sc.nextInt();

        int check=1;

        if(row!=col)
            System.out.println("Not Identity Matrix");
        else
        {
            int[][] m1 = new int[row][col];
            System.out.println("Enter the Elements in tha Matrix:");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    m1[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    if(i==j && m1[i][j]!=1)
                    {
                        check=0;
                        break;
                    }
                    if(i!=j && m1[i][j]!=0)
                    {
                        check=0;
                        break;
                    }
                }
            }
            if(check!=0)
                System.out.println("It is an Identity Matrix");
            else
                System.out.println("Not Identity Matrix");
        }
    }
}
