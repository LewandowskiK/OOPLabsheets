//Exercise7
//NumbersGUI.java
/*This program will output a window to the user that asks it to input some numbers
* It will then output the smallest and the largest numbers after the user
* inputs such numbers, or a appropriate message*/

package labsheet2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumbersGUI {
    JFrame window;
    JLabel promptLabel,largestLabel,smallestLabel;
    JTextField numberField;
    double largestNumber, smallestNumber;
    boolean firstRun = true;

    public NumbersGUI(){

        window = new JFrame("Numbers Application");

        FlowLayout flowLayout = new FlowLayout();
        window.setLayout(flowLayout);

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        window.setSize(500,150);

        promptLabel = new JLabel("Please enter your numbers here ");
        window.add(promptLabel);

        numberField = new JTextField(20);
        window.add(numberField);

        largestLabel = new JLabel("No numbers entered yet");
        window.add(largestLabel);

        smallestLabel = new JLabel();
        window.add(smallestLabel);

        TextFieldEventHandler handler = new TextFieldEventHandler();
        numberField.addActionListener(handler);

        window.setVisible(true);
    }

    public static void main(String[] args) {
        NumbersGUI guiApp = new NumbersGUI();
    }

    private class TextFieldEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e)
        {
            double input;
            if(numberField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,
                        "You must enter something!!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                input = Double.parseDouble(numberField.getText());
                if(firstRun)
                {
                    largestNumber = input;
                    smallestNumber = input;
                    firstRun = false;
                }
                else
                {
                    if(input > largestNumber)
                        largestNumber = input;
                    if(input < smallestNumber)
                        smallestNumber = input;
                }

                numberField.setText("");
                largestLabel.setText("Largest number so far is: " + largestNumber);
                smallestLabel.setText("Smallest number so far is: " + smallestNumber);
            }
        }
    }
}
