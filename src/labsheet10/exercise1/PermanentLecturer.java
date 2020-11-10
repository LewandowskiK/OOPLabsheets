package labsheet10.exercise1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer {
    private String pensionEntitlements;
    private String status;

    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment, String status, String pensionEntitlements) {
        super(name, address, dateOfBirth, staffID, coursesTaught, dateOfAppointment);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }

    public String getStatus() {
        return status;
    }

    public int getPointOnScale() {
        GregorianCalendar todaysDate = new GregorianCalendar();
        SimpleDateFormat getDay = new SimpleDateFormat("dd");
        SimpleDateFormat getMonth = new SimpleDateFormat("MM");
        SimpleDateFormat getYear = new SimpleDateFormat("yyyy");
        int todaysDay = Integer.parseInt(getDay.format(todaysDate.getTime()));
        int todaysMonth = Integer.parseInt(getMonth.format(todaysDate.getTime()));
        int todaysYear = Integer.parseInt(getYear.format(todaysDate.getTime()));
        int employmentDay = Integer.parseInt(getDay.format(getDateOfAppointment().getTime()));
        int employmentMonth = Integer.parseInt(getMonth.format(getDateOfAppointment().getTime()));
        int employmentYear = Integer.parseInt(getYear.format(getDateOfAppointment().getTime()));

        if((todaysYear-employmentYear)>20){
            return 20;
        }
        else{
            if(employmentMonth>=todaysMonth){
                if(employmentMonth==todaysMonth){
                    if(employmentDay>=todaysDay)
                        return todaysYear-employmentYear;
                    else
                        return todaysYear-employmentYear+1;
                }
                else
                    return todaysDay-employmentYear;
            }
            else
                return todaysYear-employmentYear+1;
        }
    }

    public String toString() {
        return super.toString() + "\nLecturer Pension Entitlements: " + getPensionEntitlements();
    }
}
