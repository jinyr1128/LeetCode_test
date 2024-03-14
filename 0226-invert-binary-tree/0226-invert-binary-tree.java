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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        // 현재 노드의 왼쪽과 오른쪽 자식 노드를 서로 바꿉니다.
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        // 왼쪽 및 오른쪽 자식 노드에 대해 재귀적으로 반복합니다.
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}
