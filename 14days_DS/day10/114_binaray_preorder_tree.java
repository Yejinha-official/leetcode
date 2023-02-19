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

    // using recursion. 
    // If there's no left node, then begin to search right node 

    List<Integer> result = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {
        recursive(root);
        return result; 
    }

    public void recursive(TreeNode root){
        if(root != null){
            result.add(root.val);
            recursive(root.left);
            recursive(root.right);
        }
    }


    
}