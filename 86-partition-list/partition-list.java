class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode a = new ListNode(-1); // Dummy node for list a
        ListNode b = new ListNode(-1); // Dummy node for list b
        ListNode tempA = a; // Pointer for list a
        ListNode tempB = b; // Pointer for list b
        ListNode temp = head; // Pointer for original list
        
        while (temp != null) {
            if (temp.val < x) {
                tempA.next = temp;
                tempA = tempA.next;
            } else {
                tempB.next = temp;
                tempB = tempB.next;
            }
            temp = temp.next;
        }
        
        // Ensure the end of the `b` list points to null to avoid cycles
        tempB.next = null;
        
        // Connect the end of list `a` to the start of list `b`
        tempA.next = b.next;
        
        // Return the correct head of the combined list
        return a.next != null ? a.next : b.next;
    }
}
