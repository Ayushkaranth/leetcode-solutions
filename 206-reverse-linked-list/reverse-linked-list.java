class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode prev=null;
        ListNode Next=head;
        while(cur!=null){
            Next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=Next;
        }
        return prev;
    }
}