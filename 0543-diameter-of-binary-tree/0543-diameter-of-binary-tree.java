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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        int h=func(root);
        return max;
    }
    public int func(TreeNode root){
        if(root==null) return 0;
        int lh = func(root.left);
        int rh = func(root.right);
        int temp = lh+rh;
        max = Math.max(max, temp);
        return 1+Math.max(lh, rh);
    }
}