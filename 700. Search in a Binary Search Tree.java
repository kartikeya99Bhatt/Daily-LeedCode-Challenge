class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // Base case
        if(root==null)
        {
            return null;
        }
        if(root.val==val)
        {
            return root;
        }
        // left
        if(val<root.val)
        {
            return(searchBST(root.left,val));
        }
        else // if(val>root.val)
        {
            return(searchBST(root.right,val));
        }
      
    }
}
