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
    int longpath=0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);

        return longpath;
    }
    int dfs(TreeNode root){
        if(root==null) return 0;

        int left=dfs(root.left);
        int right=dfs(root.right);

        int leftpath=0;
        int rightpath=0;

        if(root.left!=null && root.val==root.left.val){
            leftpath=left+1;
        }
        if(root.right!=null && root.val==root.right.val){
            rightpath=right+1;
        }

        longpath=Math.max(longpath,leftpath+rightpath);

        return Math.max(leftpath,rightpath);
    }
}