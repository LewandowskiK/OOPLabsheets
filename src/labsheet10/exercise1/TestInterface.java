package labsheet10.exercise1;

//TestInterface.java
/*A driver program that tests the functionality of the Student, UnderGraduate and
PostGraduate classes as well as the Person interface*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestInterface {
     public static void main(String args[]) {
			UnderGraduate u1 = new UnderGraduate();

			UnderGraduate u2 = new UnderGraduate("Tommy Tiernan", "Galway", new GregorianCalendar(1970,5,22),"t123456","Comedy",3.12);

			PostGraduate p1 = new PostGraduate();

			PostGraduate p2 = new PostGraduate("Eddie Murphy", "USA", new GregorianCalendar(1961,7,10), "t234567", "Comedy", "Frank Carson");

		 	PermanentLecturer permanentLecturer1 = new PermanentLecturer("Thomas Anquinas", "Dublin", new GregorianCalendar(1984, Calendar.DECEMBER,31), "52673",new String[]{"Economics 101","Media Presentation","Political Debate"}, new GregorianCalendar(2003,Calendar.JUNE,23),"Full-Time Professorship","Lots and lots of Pension Entitlements :-)");
		 	PermanentLecturer permanentLecturer2 = new PermanentLecturer("Eddie Murphy", "USA", new GregorianCalendar(1961,7,10), "t234567",new String[]{"Random"}, new GregorianCalendar(1986,Calendar.APRIL,19),"Senior Researcher","Lots and lots of Pension Entitlements :-)");

		 	TemporaryLecturer temporaryLecturer1 = new TemporaryLecturer("Thomas Anquinas", "Dublin", new GregorianCalendar(1984, Calendar.DECEMBER,31), "52673",new String[]{"Economics 101","Media Presentation","Political Debate"}, new GregorianCalendar(2018,Calendar.JUNE,23),762);
		 	TemporaryLecturer temporaryLecturer2 = new TemporaryLecturer("Thomas Anquinas", "Dublin", new GregorianCalendar(1984, Calendar.DECEMBER,31), "52673",new String[]{"Economics 101","Media Presentation","Political Debate"}, new GregorianCalendar(2016,Calendar.MARCH,8),1342);

		 	Person[] allPeople = new Person[]{u1,u2,p1,p2,permanentLecturer1,permanentLecturer2,temporaryLecturer1,temporaryLecturer2};

		 	for (Person person:allPeople){
		 		System.out.println(person + "\n\n");
			}

		 	System.exit(0);
     }
}