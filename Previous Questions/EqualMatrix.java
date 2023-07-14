public class EqualMatrix {
    public static void main(String[] args)
    {
        int[][] m1 = {{1,2,3},
                     {4,5,6}};

        int[][] m2 = {{1,2,3},
                     {4,5,6}};

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(m1[i][j]==m2[i][j])
                {
                    if(i==1 && j==2)
                    {
                        System.out.println("Matrices are Equal");
                        break;
                    }
                }
                else
                {
                    System.out.println("Matrices are Not Equal");
                    break;
                }
            }
        }
    }
}
