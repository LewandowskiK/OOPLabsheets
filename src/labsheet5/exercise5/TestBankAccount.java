package labsheet5.exercise5;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        String output;

        BankAccount acc1 = new BankAccount();

        output = "Calling the no-argument constructor. The first BankAccount object " +
                "details are: " + acc1.toString();

        BankAccount acc2 = new BankAccount("Richy Rich",.75);

        output += "Calling the multi-argument constructor. The second BankAccount object " +
                "details are: " + acc2.toString() + "Now calling the setInterestRate()" +
                " method to change the interest rate to 0.5";

        BankAccount.setInterestRate(.5);

        output += "\n\nThe first BankAccount object details are: " + acc1.toString() +
                "The second BankAccount object details are: " + acc2.toString() +
                "Total number of BankAccount objects created: " + BankAccount.getNumber();

        JOptionPane.showMessageDialog(null,output,
                "BankAccount Object Data", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
