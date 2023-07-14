public class TransposeMatrix {
    public static void main(String[] args)
    {
        int[][] m1={{1,2,3},
                {4,5,6}};
        int[][] m2 = new int[3][2];
        System.out.println("The given Matrix is:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                m2[j][i]=m1[i][j];
            }
        }
        System.out.println("Transpose of the Matrix is:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
