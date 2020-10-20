package labsheet7.exercise3;

public class Department {
    private String name;
    private Student[] students;

    public Department (String name, Student[] students){
        setName(name);
        setStudents(students);
    }

    public String getName() {
        return name;
    }
    public Student[] getStudents() {
        return students;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String toString(){
        return "\nDepartment: " + getName();
    }
}
