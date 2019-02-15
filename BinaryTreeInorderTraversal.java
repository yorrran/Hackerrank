class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<Integer>();
        if(root == null) return li;
        rootInorder(root, li);
        return li;
    }
    public void rootInorder(TreeNode root, List<Integer> li){
        if(root == null){
            return;  
        }
        rootInorder(root.left, li);
        li.add(root.val);
        rootInorder(root.right, li);
    }
}
