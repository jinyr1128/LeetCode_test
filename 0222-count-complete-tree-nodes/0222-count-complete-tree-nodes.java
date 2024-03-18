/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftDepth = getDepth(root, true);
        int rightDepth = getDepth(root, false);
        
        // 왼쪽 깊이와 오른쪽 깊이가 같다면, 완벽하게 채워진 이진 트리이므로 2^h - 1을 반환합니다.
        if (leftDepth == rightDepth) {
            return (1 << leftDepth) - 1;
        } else {
            // 깊이가 다르다면, 왼쪽과 오른쪽 서브트리를 재귀적으로 탐색합니다.
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }
    
    // 왼쪽 혹은 오른쪽 깊이를 구하는 메소드
    private int getDepth(TreeNode node, boolean isLeft) {
        int depth = 0;
        while (node != null) {
            depth++;
            node = isLeft ? node.left : node.right;
        }
        return depth;
    }
}
