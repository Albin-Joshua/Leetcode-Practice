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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                if(node != null){
                    l.add(node.val);
                    q.offer(node.left);
                    q.offer(node.right);
                }
            }
            if(l.size()>0){
                result.add(l);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(List<Integer> i: result){
            int tempSize = i.size();
            res.add(i.get(tempSize-1));
        }
        return res;
    }
}