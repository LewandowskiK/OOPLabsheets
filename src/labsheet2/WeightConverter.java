//Exercise6
//WeightConverter.java
/*This program will ask the user to input an amount of pounds into a text bar and
* output the equivalent in kilograms*/

package labsheet2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeightConverter {
    JFrame window;
    JLabel poundLabel, kiloLabel;
    JTextField poundField;
    JButton conversionButton;
    final double WEIGHT_CONVERSION = .454;

    public WeightConverter() {

        String pounds;
        window = new JFrame("Pound Converter");

        FlowLayout flowLayout = new FlowLayout();

        window.setLayout(flowLayout);

        window.setSize(300,100);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        poundLabel = new JLabel("Pounds");
        window.add(poundLabel);

        poundField = new JTextField(5);
        window.add(poundField);

        kiloLabel = new JLabel();
        window.add(kiloLabel);

        TextFieldEventHandler handler = new TextFieldEventHandler();
        poundField.addActionListener(handler);

        window.setVisible(true);
    }

    public static void main(String[] args) {
        WeightConverter guiApp = new WeightConverter();
    }

    private class TextFieldEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e)
        {
            double input;

            if(poundField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,
                        "You must enter a value to convert",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                input = Double.parseDouble(poundField.getText());
                kiloLabel.setText("The equivalent in kilogrammes is " +
                        String.format("%.2f",input * WEIGHT_CONVERSION));
            }
        }
    }

}
