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

    public void printInorderNode(){
        if (left != null){
            left.printInorderNode();
        }
        System.out.printf("%d ", val);
        if (right != null){
            right.printInorderNode();
        }
    }

    public int getHeightNode(){
        double hL = 0, hR = 0;
        if (left != null){
            hL = left.getHeightNode();
        }
        if (right != null){
            hR = right.getHeightNode();
        }
        int height = (int) (1+Math.max(hL, hR));
        return height;
    }

    public int sumLeavesNode() {
        if (left == null && right == null){
            return val;
        }
        else if (right == null){
            return left.sumLeavesNode();
        }
        else if (left == null){
            return right.sumLeavesNode();
        }
        return left.sumLeavesNode() + right.sumLeavesNode();
    }


    public int countFullNode() {
        int count = 0;
        if (left != null && right != null){
            count = left.countFullNode()+ right.countFullNode();
            count ++;
        }
        return count;
    }
}
