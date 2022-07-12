package Trees;

public class Student{
    String id;
    String name;
    Double grade;

    public Student(String id, String name, Double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Double getGrade() {
        return this.grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s", this.id, this.name, this.grade);
    }
}