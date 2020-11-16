package labsheet12.exercise1;

//BorderLayoutWindowEvent.java
/*This program shows how the BorderLayout layout manager and window-events
operate*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TextAnalyser extends JFrame {
    JTextArea textArea;
    public TextAnalyser() {
        super("Text Analyser");

        BorderLayout layout = new BorderLayout(6, 8);
        setLayout(layout);

        JLabel label = new JLabel("Please enter your text in the text-area below");
        add(label,BorderLayout.NORTH);

        textArea = new JTextArea();
        textArea.setForeground(Color.BLUE);
        textArea.setLineWrap(true);
        add(textArea,BorderLayout.CENTER);

        addWindowListener(new WindowEventHandler());
        setSize(400, 300);

        setVisible(true);
    }


    public static void main(String args[]) {
        TextAnalyser b = new TextAnalyser();
    }

    private class WindowEventHandler implements WindowListener {

        public void windowOpened(WindowEvent e) {
            //welcome message omitted
            JOptionPane.showMessageDialog(null,
                    "WELCOME MESSAGE","Program Information",
                    JOptionPane.INFORMATION_MESSAGE);

        }

        //hides the window on closing by default (so application is still actually running in background)
        public void windowClosing(WindowEvent e) {
            JOptionPane.showMessageDialog(null,"Thank you for using the system","Exiting apllication",JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }

        //method only called when dispose() is called on the relevant window from elsewhere
        public void windowClosed(WindowEvent e) {
            System.exit(0);
        }


        public void windowIconified(WindowEvent e) {

            displayStats();
        }


        public void windowDeiconified(WindowEvent e) {

        }


        public void windowActivated(WindowEvent e) {

        }


        public void windowDeactivated(WindowEvent e) {

        }
    }


    private void displayStats(){
        String text = textArea.getText();
        int length = text.length(), numLetters = 0,numDigits = 0,numWords = 0,numSentences = 0, numVowels = 0, endsInD = 0;
        String output = "Statistical information for text entered\n\n\nTotal number of characters: " + length +
                "\nTotal Number of letters: ";
        for(int i = 0; i < length; i++){

            if(Character.isLetter(text.charAt(i)))
                numLetters++;

            if(Character.isDigit(text.charAt(i)))
                numDigits++;

            if(text.toLowerCase().charAt(i)=='a'||text.toLowerCase().charAt(i)=='e'||text.toLowerCase().charAt(i)=='i'||
                    text.toLowerCase().charAt(i)=='o'||text.toLowerCase().charAt(i)=='u')
                numVowels++;

            if(text.charAt(i) == ' ' || text.charAt(i) == '.' || text.charAt(i) == ',' ||
                    text.charAt(i) == ';')
                numWords++;

            if(text.charAt(i) == '.')
                numSentences++;

            if(text.toLowerCase().charAt(i)=='d' && !Character.isLetter(text.charAt(i+1)))
                endsInD++;
        }
        output += numLetters + "\nTotal number of vowels: " + numVowels + "\nTotal number of digits: " + numDigits +
                "\nTotal number of words: " + numWords + "\nTotal number of sentences: " + numSentences +
                "\nTotal words ending in 'd': " + endsInD;
        JOptionPane.showMessageDialog(null,output,"Program Data",JOptionPane.INFORMATION_MESSAGE);
    }
}
