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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        List<Integer>tempAns=new ArrayList<>();
       
        Queue<TreeNode>pq=new ArrayDeque<>();
        Queue<TreeNode>cq=new ArrayDeque<>();
        pq.add(root);
        while(pq.size()>0)
        {
            TreeNode temp=pq.remove();
            tempAns.add(temp.val);
            
            if(temp.left!=null)
            {
                cq.add(temp.left);
            }
            if(temp.right!=null)
            {
                cq.add(temp.right);
            }
           if(pq.size()==0)
           {
               ans.add(tempAns);
               pq=cq;
               cq=new ArrayDeque<>();
               tempAns=new ArrayList<>();
           }
        }
        return ans;
    }
}
