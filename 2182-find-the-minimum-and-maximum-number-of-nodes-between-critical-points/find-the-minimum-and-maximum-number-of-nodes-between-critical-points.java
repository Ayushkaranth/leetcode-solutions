class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;
        int first = -1;
        int last = -1;
        int[] arr = { -1, -1 };
        int mind = Integer.MAX_VALUE;
        int idx = 1;
        while (right != null) {
            if ((mid.val < left.val && mid.val < right.val) || (mid.val > left.val && mid.val > right.val)) {
                if (first == -1) first = idx;
                if (last != -1) {
                    int dist = idx - last;
                    mind = Math.min(mind, dist);
                }
                last = idx;
            }
            left = left.next;
            mid = mid.next;
            right = right.next;
            idx++;
        }
        if (first == last) return arr;
        int maxd = last - first;
        arr[0] = mind;
        arr[1] = maxd;
        return arr;
    }
}
