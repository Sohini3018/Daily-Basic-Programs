// https://www.geeksforgeeks.org/problems/key-pair5616/1

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        // O(n^2)
        // sp - O(1)
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }
    
    boolean hasArrayTwoCandidates(int arr[], int x) {
        // better
        // best if we need to also return indexes
        // O(nlogn)
        // sp - O(n) using HashMap
        int n = arr.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Take the hashmap and check if (target - curr_elem)
        // is present in the hash map
        // if not present insert the curr in the map
        // for further checking..
        for(int i = 0; i < n; i++) {
            int search = x - arr[i];
            if(!map.containsKey(search)){
                map.put(arr[i], i);
            } else {
                return true;
            }
        }
      
        return false;  
    }
    
    boolean hasArrayTwoCandidates(int arr[], int x) {
        // optimal
        // but in case of returning indexes hash is better
        // TC - O(n) for traversal of array + O(nlogn) for sorting
        // space - O(1) but we are sorting and changing the array in case
        // space - O(n) can be said
        // but technically not using any extra space
        int n = arr.length;
        
        // sort the array smalls are on the left and bigger are on the right
        Arrays.sort(arr);
        
        // two pointers on both ends
        int left = 0;
        int right = n - 1;
        
        // when sum is small we will fo right
        // when sum becomes big we will come left towards smaller parts
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum < x) left++;
            else if (sum > x) right--;
            else return true; // sum == x
        }
        
        return false; 
    }
}
