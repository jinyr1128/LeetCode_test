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
    public ListNode removeElements(ListNode head, int val) {
        // 머리 노드가 null이거나 머리 노드 값이 val과 같을 때 처리
        while (head != null && head.val == val) {
            head = head.next;
        }

        // 현재 노드를 설정
        ListNode curr = head;
        
        // 현재 노드와 현재 노드의 다음 노드가 null이 아닐 때까지 반복
        while (curr != null && curr.next != null) {
            // 다음 노드의 값이 val과 같다면, 다음 노드를 건너뛰고 그 다음 노드를 가리킴
            if (curr.next.val == val) curr.next = curr.next.next;
            else {
                // 그렇지 않다면, 다음 노드로 이동
                curr = curr.next;
            }
        }
        // 새로운 머리 노드를 반환
        return head;
    }
}
