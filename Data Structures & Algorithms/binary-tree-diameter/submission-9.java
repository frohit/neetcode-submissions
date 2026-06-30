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
    int max[]  = new int[1];
    public int diameterOfBinaryTree(TreeNode root) {
        heightOfNode( root);
        return max[0];
    }
    private int heightOfNode(TreeNode node){
        if(node == null) return 0;
        int left  = heightOfNode(node.left);
        int right = heightOfNode(node.right);

        max[0] = Math.max(max[0],left+right);
        return Math.max(left,right)+1;
    }
}
