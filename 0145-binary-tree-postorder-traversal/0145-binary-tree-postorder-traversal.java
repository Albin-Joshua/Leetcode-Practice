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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Solution.traversal(root, res);
        return res;
    }
    public static void traversal(TreeNode root, List<Integer> res){
        if(root==null) return;
        Solution.traversal(root.left, res);
        Solution.traversal(root.right, res);
        res.add(root.val);
    }
}