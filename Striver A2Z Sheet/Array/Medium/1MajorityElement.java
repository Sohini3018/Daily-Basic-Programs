class Solution
{
    static int majorityElement(int a[], int size)
    {
        // Moore's voting algo
        
        int vote = 0;
        int element = a[0];
        int i = 0;
        
        while(i < size) {
            // if element is same then vote++
            if(a[i] == element) {
                vote++;
            } else if(vote == 0){
                // if vote becomes 0 in any iteration replace element with new one and init vote = 0
                 element = a[i];
                 vote = 0;
            } else{
                // if element is diff then vote--
                vote--;
            }
            i++;
        }

        // check how many times that element is there in the array
        // this checking is imp as vote number or the element we got may not be the majority
        // {1,2,3} --> element = 3 , vote = -3 as all are diff
      
        int occ = 0;
        for(int j = 0; j < size; j++) {
            if(a[j] == element) {
                occ++;
            }
        }
        
        if(occ > size/2) return element;
        else return -1;
    }
}
