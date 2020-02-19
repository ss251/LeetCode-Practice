// https://leetcode.com/problems/merge-two-binary-trees/
// 617. Merge Two Binary Trees

class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        // Only one constructor provided.
        // TreeNode merge = new TreeNode(t1.val);

        if (t1 == null) {
            return t2;
        }
        if (t2 != null) {
            t1.val += t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
        }
        return t1;
    }
}
