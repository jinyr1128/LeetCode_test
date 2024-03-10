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
    public ListNode reverseList(ListNode head) {
        // 기본 조건: 빈 리스트 또는 마지막 노드에 도달했을 때
        if (head == null || head.next == null) return head;
        
        ListNode newHead = reverseList(head.next); // 리스트의 나머지 부분을 역순으로 만들고, 새로운 헤드를 얻음
        head.next.next = head; // 현재 노드의 다음 노드가 현재 노드를 가리키도록 변경
        head.next = null; // 현재 노드의 다음 노드를 null로 설정하여 역순 연결 리스트의 끝을 표시
        
        return newHead; // 역순으로 만들어진 새로운 헤드 반환
    }
}