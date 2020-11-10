package labsheet10.exercise1;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer{
    private int hoursWorked;

    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment, int hoursWorked) {
        super(name, address, dateOfBirth, staffID, coursesTaught, dateOfAppointment);
        setHoursWorked(hoursWorked);
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public String getStatus() {
        return "Contracted temporary lecturer on part-time hours";
    }

    public int getPointOnScale() {
        GregorianCalendar todaysDate = new GregorianCalendar();
        SimpleDateFormat getYear = new SimpleDateFormat("yyyy");
        int todaysYear = Integer.parseInt(getYear.format(todaysDate.getTime()));
        int employmentYear = Integer.parseInt(getYear.format(getDateOfAppointment().getTime()));

        if(todaysYear-employmentYear>=3&&getHoursWorked()>1500){
            //month check similar to permanent lecturer
            return 4;
        }
        else if(todaysYear-employmentYear>=3&&getHoursWorked()>1000){
            //month check similar to permanent lecturer
            return (int)(((getHoursWorked())*(1.33))/700)+1;
        }
        else
            return todaysYear-employmentYear;
    }

    public String toString() {
        return super.toString() + "\nLecturer hours Worked: " + getHoursWorked();
    }
}
