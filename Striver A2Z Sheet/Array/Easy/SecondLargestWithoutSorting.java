class Solution {
    public int print2largest(List<Integer> arr) {
        // Initialize the largest variable to the first element of the list
        int largest = arr.get(0);
        // Initialize the second largest variable to -1, assuming it doesn't exist initially
        int s_largest = -1;
        
        // Iterate over the list to find the largest and second largest elements
        for(int i = 0; i < arr.size(); i++) {
            // Check if the current element is greater than the current largest element
            if(arr.get(i) > largest) {
                // If true, update the second largest to be the current largest
                s_largest = largest;
                // Update the largest to be the current element
                largest = arr.get(i);
            // Check if the current element is less than the current largest
            // and greater than the current second largest
            } else if(arr.get(i) < largest && arr.get(i) > s_largest) {
                // Update the second largest to be the current element
                s_largest = arr.get(i);
            }
        }
        
        // Return the second largest element
        return s_largest;
    }
}
