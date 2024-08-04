// https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        // creating an array of type Meeting if same n size
        Meeting meet[] = new Meeting[n];
        
        // store start, end pair in the array
        for(int i = 0; i < n; i++) {
            meet[i] = new Meeting(start[i], end[i]);
        }
        
        // sort acc to the end time so that we get short meetings earlier
        // greedy approach
        Arrays.sort(meet, (start_t, end_t) -> start_t.end - end_t.end);
        
        int max = 1;
        int curr_end = meet[0].end;
        
        // only get meetings whoose end time do not overlap
        for(int i = 1; i < n; i++) {
            if(meet[i].start > curr_end) {
                max++;
                curr_end = meet[i].end;
            }
        }
        
        return max;
        
    }
}

class Meeting {
    int start;
    int end;
    
    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
