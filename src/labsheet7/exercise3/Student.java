package labsheet7.exercise3;

public class Student {
    private int id;
    private String name;
    private String department;

    public Student(String name, int id, String department){
        setId(id);
        setName(name);
        setDepartment(department);
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString(){
        return "Student Name: " + getName() + "  Student Id: " +
                getId() + "  Student Department: " + getDepartment();
    }
}
