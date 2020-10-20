//Exercise8
//NamesGUI.java
/*This program will ask the user to fill out a */

package labsheet2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NamesGUI {
    JFrame window;
    JLabel nameLabel, infoLabel;
    JTextField nameField;
    String names[] = new String[5];
    JButton searchButton, longestNameButton;
    int counter = 0;
    TextFieldEventHandler textHandler = new TextFieldEventHandler();
    public NamesGUI(){
        window = new JFrame("Student Names");

        window.setSize(500,100);

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        FlowLayout flowLayout = new FlowLayout();
        window.setLayout(flowLayout);

        nameLabel = new JLabel("Name");
        window.add(nameLabel);

        nameField = new JTextField(20);
        window.add(nameField);

        infoLabel = new JLabel("The names array is currently empty!" +
                "Add names using the text-field above");
        window.add(infoLabel);

        searchButton = new JButton("Search");
        longestNameButton = new JButton("Find Longest Name");
        window.add(searchButton);
        window.add(longestNameButton);
        searchButton.setVisible(false);
        longestNameButton.setVisible(false);


        nameField.addActionListener(textHandler);

        ButtonEventHandler buttonHandler = new ButtonEventHandler();
        searchButton.addActionListener(buttonHandler);
        longestNameButton.addActionListener(buttonHandler);

        window.setVisible(true);
    }

    public static void main(String[] args) {
        NamesGUI appGui = new NamesGUI();
    }

    private class TextFieldEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e)
        {
            if(!nameField.getText().equals(""))
            {
                names[counter] = nameField.getText();
                nameField.setText("");
                counter++;
                if(counter < names.length)
                {
                    infoLabel.setText("Name added! " + (names.length - counter) +
                            " slots of the array remain empty");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "Names array now full! To find longest" +
                            " name or search this array hit return",
                            "Array Full!",
                            JOptionPane.INFORMATION_MESSAGE);
                    infoLabel.setVisible(false);
                    searchButton.setVisible(true);
                    longestNameButton.setVisible(true);
                    nameField.removeActionListener(textHandler);
                    window.repaint();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                        "You must enter a name!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ButtonEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e){
            if(e.getSource() == searchButton)
            {
                String request = nameField.getText();
                nameField.setText("");
                int i;

                for(i = 0; i < names.length; i++)
                {
                    if(names[i].equals(request))
                    {
                        JOptionPane.showMessageDialog(null,
                                "The name you searched for, " +
                                request + " was found!",
                                "Name Found!",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
                if(i==names.length)
                {
                    JOptionPane.showMessageDialog(null,
                            "The name you searched for, " +
                                    request + " was not found!",
                            "Name Not Found!",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            }
            else
            {
                int longest = 0;
                String longestName = "";
                for(int i = 0; i < names.length; i++)
                {
                    if(i==0)
                    {
                        longest = names[i].length();
                        longestName = names[i];
                    }
                    else if(names[i].length()>=longest)
                    {
                        if(names[i].length()>longest)
                        {
                            longest = names[i].length();
                            longestName = names[i];
                        }
                        else
                        {
                            longestName += ", " + names[i];
                        }
                    }
                }
                JOptionPane.showMessageDialog(null,
                        "The longest name found is " + longestName,
                        "Longest Name!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
