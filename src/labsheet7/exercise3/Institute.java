package labsheet7.exercise3;

public class Institute {
    private String name;
    private Department[] departments;

    public Institute(Department[] departments){
        setDepartments(departments);
        setName("Institute of Technology, Tralee");
    }

    public String getName() {
        return name;
    }
    public Department[] getDepartments() {
        return departments;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getTotalStudents(){
        int total = 0;
        for(Department department:getDepartments()){
            if(department!=null){
                for (Student student:department.getStudents()){
                    if(student != null)
                        total++;
                }
            }
        }
        return total;
    }

    public String toString(){
        String output = getName() + "\n\nDepartments:\n";
        for (Department department:getDepartments())
            if (department != null) {
                output += department.toString() + "\nList of Students:\n\n";
                for(Student student:department.getStudents()){
                    if(student!=null){
                        output += student.toString() + "\n";
                    }
                }
            }

        output += "\nTotal number of students " + getTotalStudents();

        return output;
    }
}
