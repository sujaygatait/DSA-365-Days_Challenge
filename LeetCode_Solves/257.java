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
    public void helper(TreeNode root, ArrayList<Integer> path, ArrayList<String> ans) {
        if(root == null) return;

        path.add(root.val);

        if(root.left==null && root.right==null) {
            String s = "";
            for(int i=0; i<path.size(); i++) {
                if(i == path.size()-1) s += path.get(i);
                else s += path.get(i) + "->";
            }
            ans.add(s);

            path.remove(path.size()-1);

            return;
        }

        helper(root.left, path, ans);
        helper(root.right, path, ans);

        path.remove(path.size()-1);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        helper(root, path, ans);

        return ans;
    }
}
