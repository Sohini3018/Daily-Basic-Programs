// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // brutfoce
        // keep on checkeing on the right for every element
        // if any larger element found break the loop and check for next
        
        // TC - O(n^2) almost, 2nd loop doesn't run fully from 0 to n-1
        // SC - O(n) in the worst where everyone is leader
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            boolean leader = true;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if(leader == true) list.add(arr[i]);
        }
        
        return list;
    }
    
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Optimal
        // check from back and keep a track for current max
        // if any prev element is > max then it is definitely > all 
        // elements in it's right
        
        // TC - O(n)
        // SC - O(n) in the worst where everyone is leader
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int max = Integer.MIN_VALUE; // last element will be always leader
        // we need to take min value so that atleast last one is greater
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] >= max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        // Collections.sort(list, Collections.reverseOrder());
        // Actually already reverse sorted
        // no need to sort again..so 
        return list;
    }
}
