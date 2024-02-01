class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 두 트리 모두 null인 경우, 동일하다고 판단
        if (p == null && q == null) return true;
        // 한쪽 트리만 null인 경우, 동일하지 않다고 판단
        if (p == null || q == null) return false;
        // 두 노드의 값이 다른 경우, 동일하지 않다고 판단
        if (p.val != q.val) return false;
        // 위의 모든 경우가 아닌 경우, 재귀적으로 왼쪽 서브트리와 오른쪽 서브트리를 비교
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}