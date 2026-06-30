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
    int max  = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int left = heightOfNode( root.left);
        int right = heightOfNode(root.right);
        return Math.max(max,left+right+2);
    }
    private int heightOfNode(TreeNode node){
        if(node == null) return -1;
        int left  = heightOfNode(node.left);
        int right = heightOfNode(node.right);
        int k =Math.max(left,right)+1;

        max = Math.max(max,left+right+2);
        return k;
    }
}
