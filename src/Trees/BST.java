package Trees;

class BST {
    private TreeNode root;

    public BST(){
        this.root = null;
    }

    public void addToBST(int val){
        if(root == null){
            root = new TreeNode(val);
        }
        else{
            root.addToNode(val);
        }
    }

    public int minBST(){
        return root.minNode();
    }

    public void printInorderBST(){
        root.printInorderNode();
    }

}
