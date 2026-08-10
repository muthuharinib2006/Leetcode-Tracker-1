// Last updated: 8/10/2026, 6:27:07 PM
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
    private int c=0;
    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return c;
    }
    private int dfs(TreeNode node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int leftMax=dfs(node.left);
        int rightMax=dfs(node.right);
        int maxValue=Math.max(node.val,Math.max(leftMax,rightMax));

        if(node.val==maxValue){
            c++;
        }
        return maxValue;
    }
}