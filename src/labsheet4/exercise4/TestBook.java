package labsheet4.exercise4;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {
        JTextArea output = new JTextArea(5,50);
        Font textFont = new Font("monospaced", Font.PLAIN,12);
        output.setFont(textFont);

        output.append(String.format("%-20s%-10s%-15s%-5s\n\n","Title","Price","ISBN","Pages"));
                //initial values added for faster testing
        Book b1 = new Book(JOptionPane.showInputDialog("Please enter the title of your " +
                "favorite book" +
                "","Tom Sawyer"),
                Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of " +
                        "your favorite book","25.50")),
                JOptionPane.showInputDialog("Please enter the ISBN of your favorite book",
                        "6453728382"),
                Integer.parseInt(JOptionPane.showInputDialog("Please enter the number " +
                        "of pages in your favorite book","432")));

        output.append(b1.toString());
                //initial values added for faster testing
        Book b2 = new Book(JOptionPane.showInputDialog("Please enter the title of your " +
                "least favorite book","The DaVinci Code"),
                Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of " +
                        "your least favorite book","32.99")),
                JOptionPane.showInputDialog("Please enter the ISBN of your least favorite book",
                        "8745633456"),
                Integer.parseInt(JOptionPane.showInputDialog("Please enter the number " +
                        "of pages in your least favorite book","621")));

        output.append("\n\n" + b2.toString());

        JOptionPane.showMessageDialog(null,output,
                "Book Object Data",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
