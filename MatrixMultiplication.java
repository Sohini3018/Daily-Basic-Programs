public class MatrixMultiplication {
    public static void main(String[] args)
    {
        int[][] m1={{1,2,3},
                    {4,5,6}};
        int[][] m2={{7,8},
                    {9,10},
                    {11,12}};
        int[][] m=new int[2][2];
        for(int i=0;i<2;i++)
        {
            int k=0;
            while(k<2)
            {
                int sum=0;
                for(int j=0;j<3;j++) {
                    sum+= m1[i][j]*m2[j][k];
                }
                m[i][k]=sum;
                //System.out.print(m[i][k] + " ");
                k++;
            }
            //System.out.println();
        }
        System.out.println("The multiplication matrix will be :");
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

