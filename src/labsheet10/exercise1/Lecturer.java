package labsheet10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person{
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    public Lecturer() {
        this("Undefined","Undefined",null,"Undefined",null,null);
    }
    public Lecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment) {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffID(staffID);
        setCoursesTaught(coursesTaught);
        setDateOfAppointment(dateOfAppointment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public abstract String getStatus();
    public abstract int getPointOnScale();

    public String toString() {
        String output = "Lecturer name is " + getName() +
                "\nLecturer address is " + getAddress() +
                "\nLecturer date of birth is ";
        if(getDateOfBirth()!=null){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            output += dateFormat.format(getDateOfBirth().getTime());
        }
        else
            output+="Undefined";

        output += "\nLecturer StaffID is " + getStaffID() +
                  "\nLecturer Courses taught are " + Arrays.toString(getCoursesTaught()) +
                  "\nLecturer date of Appointment is ";

        if(getDateOfAppointment()!=null){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            output += dateFormat.format(getDateOfAppointment().getTime());
        }
        else
            output += "Undefined";

        output += "\nLecturer status is " + getStatus() +
                "\nLecturer point on scale is " + getPointOnScale();

        return output;
    }
}
