package labsheet7.exercise3;

public class TestCollegeApp {
    public static void main(String[] args) {
        Student student1 = new Student("Jake",154345,"Computing");
        Student student2 = new Student("Mary",234532,"Creative Media");
        Student student3 = new Student("Tommy",453726,"Computing");
        Student student4 = new Student("Peter",623456,"Creative Media");

        Student[] computingStudents = new Student[10];
        computingStudents[0] = student1;
        computingStudents[1] = student3;

        Student[] mediaStudents = new Student[10];
        mediaStudents[0] = student2;
        mediaStudents[1] = student4;

        Department Computing = new Department("Computing",computingStudents);
        Department CreativeMedia = new Department("Creative Media",mediaStudents);

        Department[] departments = new Department[5];
        departments[0] = Computing;
        departments[1] = CreativeMedia;

        Institute institute = new Institute(departments);

        System.out.println(institute.toString());

        System.out.println("\n\n\n\n\nNow moving Jake to the Creative Media department\n\n");
        int searchId = 154345;
        String currentDepartment = "";

        for(Department department:institute.getDepartments())
            if(department!=null)
                for(Student student:department.getStudents())
                    if(student!=null)
                        if(student.getId()==searchId)
                        {
                            System.out.println("Found " + student.getName());
                            if(student.getDepartment().equals("Creative Media"))
                                System.out.println(student.getName() + "is already in the Creative Media department");
                            else
                                currentDepartment = student.getDepartment();
                        }
        Student requestStudent = null;
        if(!currentDepartment.equals(""))
            for(Department department:institute.getDepartments()){
                if(department!=null){
                    if(department.getName().equals(currentDepartment))
                    {
                        int counter = 0;
                        Student[] students = department.getStudents();
                        for (Student student:department.getStudents())
                            if(student!=null){
                                if (student.getId()==searchId){
                                    students[counter]=null;
                                    requestStudent = student;
                                    department.setStudents(students);
                                }
                                else
                                    counter++;
                            }
                    }
                }

            }
        if(requestStudent==null)
            System.out.println("Student with ID " + searchId +" not Found!");
        else{
            for (Department department:institute.getDepartments())
                if(department!=null)
                    if(department.getName().equals("Creative Media")){
                        int counter = 0;
                        Student[] students = department.getStudents();
                        for (Student student:department.getStudents()) {
                            if(student!=null)
                                counter++;
                            else{
                                students[counter]=requestStudent;
                                department.setStudents(students);
                                break;
                            }
                        }
                    }
        }
        System.out.println("\n\n" + institute.toString());
    }
}
