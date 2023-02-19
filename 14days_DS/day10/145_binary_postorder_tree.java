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
    public List<Integer> postorderTraversal(TreeNode root) {

        //Using two stacks. One for saving nodes that already searched 
        //and one for saving values (Because it is post order so using LIFO characteristic)
        Stack<TreeNode> saveSearchedStack = new Stack<TreeNode>();
        Stack<Integer> valueStack = new Stack<Integer>(); 
        List<Integer>  result = new ArrayList<Integer>(); 

        if(root == null) return result; 

        saveSearchedStack.push(root);

        TreeNode curr; 

        while(!saveSearchedStack.isEmpty()){
            curr = saveSearchedStack.pop();
            valueStack.push(curr.val);
            
            if(curr.left !=null){
                saveSearchedStack.push(curr.left);
            }
            if(curr.right!=null){
                saveSearchedStack.push(curr.right); 
            }

            

        }

        while(!valueStack.isEmpty()){
            result.add(valueStack.pop());
        }


        return result; 
        
    }

    
    
}