class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;  // Base case: if there are fewer than 2 nodes
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        while (head != null && head.next != null) {
            // Swap the nodes
            prev.next = head.next;
            head.next = head.next.next;
            prev.next.next = head;
            
            // Move prev and head to the next pair
            prev = head;
            head = head.next;
        }
        
        return dummy.next;
    }
}