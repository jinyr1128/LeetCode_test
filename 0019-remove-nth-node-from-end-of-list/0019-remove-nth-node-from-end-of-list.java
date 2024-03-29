/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 더미 노드를 생성하고 리스트의 시작 부분에 추가합니다.
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode first = dummy;
        ListNode second = dummy;
        
        // 첫 번째 포인터를 n+1만큼 전진시킵니다.
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        
        // 첫 번째 포인터가 리스트의 끝에 도달할 때까지 두 포인터를 함께 전진시킵니다.
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        // 두 번째 포인터가 끝에서 n번째 노드의 직전 노드를 가리키므로, 해당 노드를 리스트에서 제거합니다.
        second.next = second.next.next;
        
        // 더미 노드의 다음 노드, 즉 수정된 리스트의 헤드를 반환합니다.
        return dummy.next;
    }
}