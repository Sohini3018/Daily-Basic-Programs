// link - https://www.geeksforgeeks.org/problems/next-permutation5226/1

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        List<Integer> list = new ArrayList<>();
        
        // first find the index where is the first lowest number starting from the back
        int idx = -1;
        for(int i = N - 2; i >= 0; i--) {
            // kind of bubble sort, check with adjacent
            if(arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }
        
        if(idx == -1) {
            reverse(arr, 0, N - 1);
        }
        else
        {
        
        // then again start from back ans see which is first greater number than arr[idx]
        // as the arr after the idx actually sorted in increasing order
        // that's why you come to idx that is smaller
        // swap that first greater number that you got from the back as that will be
        // smallest from arr[idx+1] - arr[n-1]
        
        for(int i = N - 1; i >= idx; i--) {
            if(arr[i] > arr[idx]) {
                swap(arr, idx, i);
                break;
            }
        }
        
        // then you need immediate permutation
        // reverse the rest part in decreasing order
        // from arr[idx+1] - arr[n-1]
        
        int first = idx + 1, last = N - 1;
        reverse(arr, first, last);
        }
        
        
        for(int i = 0; i < N; i++) {
            list.add(arr[i]);
        }
        
        return list;
        
    }
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void reverse(int[] arr, int first, int last) {
        while(first < last) {
            swap(arr, first, last);
            first++;
            last--;
        }
    }
}
