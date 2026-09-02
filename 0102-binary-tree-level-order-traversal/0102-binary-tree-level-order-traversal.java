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
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return ans;

        Deque<TreeNode>dq=new ArrayDeque<>();
        dq.offer(root);

        while(!dq.isEmpty()){
            int size=dq.size();
            List<Integer>currlavel=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=dq.poll();
                currlavel.add(node.val);

                if(node.left!=null) dq.offer(node.left);
                if(node.right!=null) dq.offer(node.right);
            }
            ans.add(currlavel);
        }
        return ans;
    }
}