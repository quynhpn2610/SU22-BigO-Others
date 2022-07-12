package Trees;

public class StudentTree {
    private StudentNode sRoot;

    public StudentTree() {
        this.sRoot = null;
    }

    public void addToStudentTree(Student s) {
        if (sRoot == null) {
            sRoot = new StudentNode(s);
        } else {
            sRoot.addToSNode(s);
        }
    }

    public String maxStudentTreeGrade(){
        return sRoot.maxGrade();
    }
}
