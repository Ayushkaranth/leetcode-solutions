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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode a=null,b=null,c=null,d=null;
        int pos=1;
        ListNode temp=head;
        while(temp!=null){
            if(pos==left-1) a=temp;
            if(pos==left)   b=temp;
            if(pos==right)  c=temp;
            if(pos==right+1) d=temp;
            temp=temp.next;
            pos++;
        }
        if(a!=null) a.next=null;
        if(c!=null) c.next=null;
        reverseList(b);
        if(a!=null) a.next=c;
        b.next=d;
        if(a==null) return c;
        return head;
    }
}