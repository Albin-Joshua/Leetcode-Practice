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
    public int goodNodes(TreeNode root) {
        Stack<List<Object>> stack = new Stack<>();
        stack.push(Arrays.asList(root, Integer.MIN_VALUE));
        int count=0;
        while(!stack.isEmpty()){
            List<Object> temp = stack.pop();
            TreeNode node = (TreeNode) temp.get(0);
            int maxSoFar = (int) temp.get(1);

            if(node.val >= maxSoFar) count++;

            if(node.left != null){
                stack.push(Arrays.asList(node.left, Math.max(maxSoFar, node.val)));
            }

            if(node.right != null){
                stack.push(Arrays.asList(node.right, Math.max(maxSoFar, node.val)));
            }
        }
        return count;
    }
}