class LargestElementInArray {
    public static int largest(int n, int[] arr) {
        // code here
        int largest = 0;
        
        for(int i = 0; i < n; i++) {
            // if larger array element found replace the largest element with that
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        return largest;
    }
    
    public static int largest(int n, int[] arr) {
        // brutforce approach
        
        // sort
        Arrays.sort(arr);
        // return the last element
        return arr[n - 1];
    }
}
