// link - https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1

class Solution {
    // Approach when both arrays are not equal
    //  almost O(2n) 2 times fill itr
    // Space O(n) for both
  
    void rearrange(int arr[], int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            if(arr[i] >= 0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }
        
        int[] new_arr = new int[n];
        int posSize = pos.size();
        int negSize = neg.size();
        int minSize = Math.min(posSize, negSize);
        
        int idx = 0;
        for(int i = 0; i < minSize; i++) {
            new_arr[idx++] = pos.get(i); // idx = 0 then increased to 1
            new_arr[idx++] = neg.get(i); // idx 1 then will be 2 for next positive element
        }
        
        // Add remaining elements from the larger list
        // now idx is (mizSize * 2) actually
        
        if (posSize > negSize) {
            for (int i = minSize; i < posSize; i++) {
                new_arr[idx++] = pos.get(i);
            }
        } else {
            for (int i = minSize; i < negSize; i++) {
                new_arr[idx++] = neg.get(i);
            }
        }
        
        // Copy new_arr back to arr
        for(int i = 0; i < n; i++) {
            arr[i] = new_arr[i];
        }
    }

    // Better -> Approach when both arrays equal
    //  almost O(n) --> 1 time fill itr
    
    void rearrange(int arr[], int n) {
        int[] new_arr = new int[n];
        
        int pos = 0;
        int neg = 1;
        
        for(int i = 0; i < n;i++) {
            if(arr[i] >= 0) {
                new_arr[pos] = arr[i];
                pos += 2;
            } else {
                new_arr[neg] = arr[i];
                neg += 2;
            }
        }
        
        // Copy new_arr back to arr
        for(int i = 0; i < n; i++) {
            arr[i] = new_arr[i];
        }
    }
}
