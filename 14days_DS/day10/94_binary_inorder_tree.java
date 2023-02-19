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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> result = new Stack<TreeNode>();
        List<Integer> returnValue= new ArrayList<Integer>();
        TreeNode current = new TreeNode(); 
        
        if(root == null) return returnValue; 
        
        current = root; 
        
        
        while(current!=null || !result.isEmpty()){
            while(current !=null){
                result.push(current);
                current = current.left; 
            }
            
            current = result.pop();
            returnValue.add(current.val);
            current = current.right; 
            
        }
        
        return returnValue; 
    }
}