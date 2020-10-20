//Exercise2
//RollTheDice.java
/*This program will roll 2 dice, 1 for the player and 1 for the computer, higher roll wins and is recorded.
* after typing 'yes' another round is played, after typing 'no' the program displays stats*/

package labsheet2;

import javax.swing.*;

public class RollTheDice {
    public static void main(String[] args) {
        int numberPCWins = 0, numberPlayerWins = 0, numberDraws = 0, numberGames =0;
        int computerRoll, playerRoll;
        String input;

        input = JOptionPane.showInputDialog("Would you like to play a game of roll the dice? (yes or no)");

        while(!input.equals("no"))
        {
            numberGames++;
            computerRoll = rollTheDice();
            playerRoll = rollTheDice();
            JOptionPane.showMessageDialog(null,
                    "The computer roll generated the value " + computerRoll +
                    ".....now hit return to see the player roll",
                    "Computer Roll",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null,
                    "The player roll generated the value " + playerRoll +
                            ".....now hit return to see the stats",
                    "Player Roll",
                    JOptionPane.INFORMATION_MESSAGE);

            if(computerRoll==playerRoll)
                numberDraws++;
            else if(computerRoll > playerRoll)
                numberPCWins++;
            else
                numberPlayerWins++;

            JOptionPane.showMessageDialog(null,
                    "Games Played: " + numberGames + "\nComputer Wins: " + numberPCWins +
                    "\nPlayer Wins: " + numberPlayerWins + "\nDraws: " + numberDraws,
                    "Player Roll",
                    JOptionPane.INFORMATION_MESSAGE);

            input = JOptionPane.showInputDialog("Would you like to play another game of roll the dice? (yes or no)");
        }

        JOptionPane.showMessageDialog(null,
                "Thanks for playing the game!",
                "Farewell",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    private static int rollTheDice()
    {
        return (int)(Math.random()*(12-2+1)+2);
    }
}
