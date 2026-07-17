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
    public int depth(TreeNode root) {
        if(root == null) return 0;

        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);

        int maxDepth = Math.max(leftDepth, rightDepth);

        return maxDepth + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        boolean check1 = isBalanced(root.left);
        if(check1 == false) return false;
        boolean check2 = isBalanced(root.right);
        if(check2 == false) return false;

        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);

        if(Math.abs(leftDepth - rightDepth) > 1) return false;
       
        return check1==true && check2==true;
    }
}
