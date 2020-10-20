package labsheet1;

import javax.swing.*;

public class Exercise3{
    public static void main(String[] args){
        String name, course, amount;
        final int cost = 2;

        name = JOptionPane.showInputDialog("Please enter your name");
        course = JOptionPane.showInputDialog("Please enter your course");
        amount = JOptionPane.showInputDialog("How many snacks do you want?");
        JOptionPane.showMessageDialog(null,
                "Name: "+ name + "\nCourse: "+course + "\nAmount of snacks: " + amount +
                        "\nCost: €" +(cost * Integer.parseInt(amount) ),
                "Receipt",
                JOptionPane.PLAIN_MESSAGE);
    }
}