class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while (head != null && head.next != null) {
            ListNode newNode = new ListNode(gcd(head.val, head.next.val));
            newNode.next = head.next;
            head.next = newNode;
            head = newNode.next;
        }
        return dummy.next;
    }

    private int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
