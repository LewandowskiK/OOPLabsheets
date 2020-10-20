package labsheet1;

import javax.swing.*;

public class Exercise8 {
    public static void main(String[] args) {
        String menuChoiceAS, numberAS;
        int menuChoice, number,iteration = 0;

        do{
            iteration++;
            menuChoiceAS =  JOptionPane.showInputDialog("What would you like to do? " +
                    "\n\n1. Determine if the number is odd or even\n" +
                    "2. Find the factorial of the number\n3. Quit\n\n" +
                    "Please enter your choice: ");
            menuChoice = Integer.parseInt(menuChoiceAS);

            switch (menuChoice){
                case 1:
                    numberAS = JOptionPane.showInputDialog("------Iteration "+
                            iteration + "------" + "\n\nPlease enter any whole number: ");

                    number = Integer.parseInt(numberAS);

                    if(number%2==0)
                    {
                        JOptionPane.showMessageDialog(null,
                                "The number you entered is even",
                                "NumberDate",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                        JOptionPane.showMessageDialog(null,
                                "The number you entered is odd",
                                "NumberDate",
                                JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    numberAS = JOptionPane.showInputDialog("------Iteration "+
                            iteration + "------" + "\n\nPlease enter any whole number: ");

                    number = Integer.parseInt(numberAS);
                    if(number < 1)
                    {
                        JOptionPane.showMessageDialog(null,
                                "You cannot find the factorial of a negative number",
                                "Number Data",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }

                    JOptionPane.showMessageDialog(null,
                            "The factorial of the number you entered is " +
                            findFactorial(number),
                            "Number Data",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Quitting the program earlier than anticipated ... goodbye",
                            "Number Date",
                            JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
            }

        }while(menuChoice!=3);
        System.exit(0);
    }
    private static double findFactorial(int a){

        double factorial = a;
        for(int i = a-1; i > 1; i--)
        {
            factorial = factorial*i;
        }
        return factorial;
    }
}
