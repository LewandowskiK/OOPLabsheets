package labsheet4.exercise3;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        Book b1 = new Book();

        output += "Calling the no-argument Book constructor. The first book is \n\n" +
                b1.toString();

        Book b2 = new Book(JOptionPane.showInputDialog("Please enter the title of your " +
                "favorite book"),
                Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of " +
                        "your favorite book")),
                JOptionPane.showInputDialog("Please enter the ISBN of your favorite book"),
                Integer.parseInt(JOptionPane.showInputDialog("Please enter the number " +
                        "of pages in your favorite book")));

        output += "\n\nCalling the multi-argument Book constructor. The second book is \n\n" +
        b2.toString();

        JOptionPane.showMessageDialog(null,output,
                "Book Object Data",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
