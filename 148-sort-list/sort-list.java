class Solution {
    public ListNode sortList(ListNode head) {
        // Base case: if the list is empty or has only one element
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split the list into two halves
        ListNode mid = getMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null; // Split the list into two halves

        // Step 2: Recursively sort each half
        left = sortList(left);
        right = sortList(right);

        // Step 3: Merge the two sorted halves
        return merge(left, right);
    }

    // Function to find the middle of the linked list (slow/fast pointer approach)
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Slow pointer will be at the middle
    }

    // Function to merge two sorted linked lists
    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Merge the two lists
        while (left != null && right != null) {
            if (left.val < right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        // If any elements are left in either list, append them
        if (left != null) {
            tail.next = left;
        } else {
            tail.next = right;
        }

        return dummy.next; // Return the merged list, skipping the dummy node
    }
}