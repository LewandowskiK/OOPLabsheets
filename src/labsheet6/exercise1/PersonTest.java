package labsheet6.exercise1;

import javax.swing.*;


public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        String output = "*****Person Class Tester*****\n\nCalling the Person() Constructor" +
                "\nValue of first person object is: " + person1.toString();


        Person person2 = new Person(JOptionPane.showInputDialog("Please enter the first name of the second person object","Jasper"),
                JOptionPane.showInputDialog("Please enter the last name of the second person object","Hound"));
        output += "Calling the Person(String, String) constructor using user supplied values\n" +
                "Value of the second person object is: " + person2.toString();

        JOptionPane.showMessageDialog(null,output,
                "",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
