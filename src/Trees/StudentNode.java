package Trees;

class StudentNode{
    public Student data;
    public StudentNode left;
    public StudentNode right;

    public StudentNode(){
        this.data = null;
        this.left = null;
        this.right = null;
    }

    public StudentNode(Student data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void addToSNode(Student sData){
        if (sData.getGrade() < data.getGrade()){
            if (left == null){
                left = new StudentNode(sData);
            }
            else{
                left.addToSNode(sData);
            }
        }
        else if(sData.getGrade() > data.getGrade()){
            if (right == null) {
                right = new StudentNode(sData);
            }
            else{
                right.addToSNode(sData);
            }
        }
    }


    public String maxGrade() {
        if(right == null) return this.data.toString();
        else{
            return right.maxGrade();
        }
    }
}
