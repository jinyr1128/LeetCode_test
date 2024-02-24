/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 두 리스트의 헤드를 초기화합니다.
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        
        // 두 리스트를 동시에 순회합니다.
        while (ptrA != ptrB) {
            // ptrA가 끝에 도달하면, headB로 이동합니다. 그렇지 않으면 다음 노드로 이동합니다.
            ptrA = (ptrA == null) ? headB : ptrA.next;
            
            // ptrB가 끝에 도달하면, headA로 이동합니다. 그렇지 않으면 다음 노드로 이동합니다.
            ptrB = (ptrB == null) ? headA : ptrB.next;
        }
        
        // 교차점을 반환합니다. 만약 교차점이 없다면, null을 반환합니다.
        return ptrA;
    }
}
