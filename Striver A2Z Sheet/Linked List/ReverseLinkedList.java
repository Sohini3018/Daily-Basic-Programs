class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        
        while(temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        
        // Pop the stack values back into the linked list
        temp = head;
        while(!st.isEmpty()) {
            temp.data = st.pop();
            temp = temp.next;
        }
        
        return head;
    }
}

class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        Node prev = null;
        Node temp = head;
        
        while(temp != null) {
            // current next to next value
            Node front = temp.next;
            // current pointer to prev
            temp.next = prev;
            // convert prev to temp -- 1 step ahead
            prev = temp;
            // temp -> temp.next 1 step ahead
            temp = front;
        }
        
        return prev;
    }
}
