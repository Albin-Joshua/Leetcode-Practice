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
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean valid(TreeNode root, long minimum, long maximum){
        if(root==null) return true;
        if(!(root.val>minimum && root.val<maximum)) return false;

        return valid(root.left, minimum, root.val) && valid(root.right, root.val, maximum);
    }
}