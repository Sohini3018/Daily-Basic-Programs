public class SparseMatrix {
    public static void main(String[] args)
    {
        int[][] m = {{1,0,0},
                     {0,1,0},
                     {3,0,0}};
        int count_zeros=0,count_non_zeros=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(m[i][j]==0)
                    count_zeros++;
                else
                    count_non_zeros++;
            }
        }
        int total_numbers=count_zeros+count_non_zeros;
        if(count_zeros>total_numbers/2)
            System.out.println("Tne matrix is a sparse matrix.");
        else
            System.out.println("Tne matrix is not a sparse matrix.");
    }
}
