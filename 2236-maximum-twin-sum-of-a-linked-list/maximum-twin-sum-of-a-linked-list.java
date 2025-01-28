class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = head;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode i = head;
        ListNode j = reverseList(slow);
        
        int maxSum = 0;
   
        while (j != null) {
            maxSum = Math.max(maxSum, i.val + j.val); 
            i = i.next;
            j = j.next;
        }
        
        return maxSum;
    }
}
