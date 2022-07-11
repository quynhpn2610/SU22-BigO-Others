package Trees;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(){
        this.val = 0;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public void addToNode(int data){
        if (data < val){
            if(left == null){
                left = new TreeNode(data);
            }
            else{
                left.addToNode(data);
            }
        }
        else if (data > val){
            if(right == null){
                right = new TreeNode(data);
            }
            else{
                right.addToNode(data);
            }
        }
    }

    public int minNode(){
        if (left==null) return val;
        else return left.minNode();
    }
}
