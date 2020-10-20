//Exercise3
//NamesArray.java
/*This program will ask the user to input 5 names.
* It will then output the longest name, the average amount of characters in each name
* and the names in ascending order*/
package labsheet2;

import javax.swing.*;
import java.util.Arrays;

public class NamesArray {
    public static void main(String[] args) {
        String []names = new String[5];
        names = populateArray();
        Arrays.sort(names);

        JOptionPane.showMessageDialog(null,
                "The longest name is " + getLongestName(names) +
                "\n\nAverage characters per name is " + getAverageCharacters(names) +
                "\n\nThe array sorted in ascending order is: \n\n" +
                        Arrays.toString(names),
                        "Results",
                        JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    private static String[] populateArray()
    {
        String []names = new String[5];

        for(int i = 0; i < names.length; i++)
        {
            names[i] = JOptionPane.showInputDialog("Please enter the name of person " +
                    (i+1));
        }

        return names;
    }
    private static  String getLongestName(String []a)
    {
        String longestName = "";

        for(int i = 0; i < a.length; i++)
        {
            if(a[i].length()>longestName.length())
                longestName = a[i];
        }

        return longestName;
    }
    private static int getAverageCharacters(String []a)
    {
        int totalCharacters = 0;


        for(int i = 0; i < a.length; i++)
        {
            totalCharacters += a[i].length();
        }

        return totalCharacters/a.length;
    }
}
