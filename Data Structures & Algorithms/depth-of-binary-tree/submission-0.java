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
    public int maxDepth(TreeNode root) {
        return maxD(root,0);
    }
    private int maxD(TreeNode node,int max){
        if(node == null) return 0;
        int left = maxD(node.left, max);
        int right = maxD(node.right,max);
        return Math.max(left,right)+1;
    }
}
