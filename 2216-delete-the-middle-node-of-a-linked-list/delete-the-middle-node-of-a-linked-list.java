class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // edge cases
        if(head.next==null) return null;
        ListNode link = null;
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            link = slow;
            slow = slow.next;
            fast = fast.next.next;
            if(fast==null || fast.next==null) break;
        }
        // slow is the middle node
        // deleting the middle node
        link.next = slow.next;
        return head;
    }
}