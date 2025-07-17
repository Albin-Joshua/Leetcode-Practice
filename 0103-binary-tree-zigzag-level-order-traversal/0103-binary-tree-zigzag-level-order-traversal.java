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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        boolean leftToRight = true;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                if(temp != null){
                    if(leftToRight){
                        l.add(temp.val);
                    }
                    else{
                        l.add(0, temp.val);
                    }
                    q.offer(temp.left);
                    q.offer(temp.right);
                }
            }
            if(l.size()>0) res.add(l);
            leftToRight = !leftToRight;
        }
        return res;
    }
}