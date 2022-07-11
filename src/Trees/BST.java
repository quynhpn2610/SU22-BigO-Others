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

    public int getHeightBST(){
        if(root == null){
            return 0;
        }
        return root.getHeightNode();
    }

    public int sumLeavesBST(){
        if(root == null){
            return 0;
        }
        return root.sumLeavesNode();
    }

    public int countFullBST(){
        if(root == null){
            return 0;
        }
        return root.countFullNode();
    }
}
