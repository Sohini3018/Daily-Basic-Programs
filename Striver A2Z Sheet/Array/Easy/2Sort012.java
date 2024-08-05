class Solution
{
    public static void sort012(int a[], int n)
    {
        // better approach
        // O(2n) but 2 iterations
        // one n for counting 0,1,2 and another n for putting them.
        
        int count_zero = 0;
        int count_one = 0;
        int count_two = 0;
        
        for(int i = 0; i < n; i++) {
            if(a[i] == 0) count_zero++;
            else if(a[i] == 1) count_one++;
            else count_two++;
        }
        
        // these 3 for loop will contribute to iterate the full array
        
        for(int i = 0; i < count_zero; i++) {
            a[i] = 0;
        }
        for(int i = count_zero; i < count_zero + count_one; i++) {
            a[i] = 1;
        }
        for(int i = count_zero + count_one; i < n; i++) {
            a[i] = 2;
        }
    }
    
    
    public static void sort012(int a[], int n)
    {
        // optimal
        // Dutch National Flag Algorithm
        // 0 --> 0 - (low-1)
        // 1 --> low - (mid-1)
        // unsorted --> mid - high
        // 2 --> (high+1) - (n-1)
        
        int low = 0;
        int mid = 0;
        int high = n - 1;
        
        
        while(mid <= high) {
            if (a[mid] == 0) {
                swap(a, low, mid);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                swap(a, high, mid);
                high--;
            }
        }
        
    }
    
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
}
}
