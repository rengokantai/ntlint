/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

// jz gp1 1:11:00
public class L661ConvertBSTtoGreaterTree {
    /*
     * @param root: the root of binary tree
     * @return: the new root
     */
    int sum;
    void dfs(TreeNode cur){
        if(cur==null){
            return;
        }
        dfs(cur.right); //visit right
        sum+=cur.val;  //in
        cur.val=sum;  //in
        dfs(cur.left);  //left
    }
    public TreeNode convertBST(TreeNode root) {
        // write your code here
        sum=0;
        dfs(root);
        return root;
    }
}
