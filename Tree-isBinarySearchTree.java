/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        Node node = new Node();
        node = root;
        if (root == null)
        {
            return true;
        }
        else{
            while(node!=null){
            if(node.left != null && node.right != null){
                if(node.left.data>node.data||node.right.data<node.data){
                return false;
            }
            else
            {
                if(node.left!=null){
                    checkBST(node.left);
                }
                if (node.right != null){
                    checkBST(node.right);
                }
            }         
            }
            
         }
        return true; 
        }
        
    }
