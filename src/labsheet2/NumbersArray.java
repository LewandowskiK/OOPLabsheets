//Exercise4
//NumbersArray.java
/*This program will initialize an array of eight doubles and output the largest number,
* the average of the numbers, and the numbers above the average*/
package labsheet2;

import javax.swing.*;

public class NumbersArray {
    public static void main(String[] args) {
        double []numbers = new double[8];
        numbers[0] = 22.3f;
        numbers[1] = 45.6f;
        numbers[2] = 27.4f;
        numbers[3] = 56.6f;
        numbers[4] = 73.2f;
        numbers[5] = 11.5f;
        numbers[6] = 87.4f;
        numbers[7] = 23.8f;

        JOptionPane.showMessageDialog(null,
                "The largest value in the array is " +
                        String.format("%.1f",largest(numbers)) +
                "\nThe average value in the array is " +
                        String.format("%.3f",average(numbers)) +
                "\nThe list of values above the average value is: " +
                        aboveAverage(numbers),
                "ArrayStats",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    private static double largest(double []a)
    {
        double largest = 0;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > largest)
                largest = a[i];
        }
        return largest;
    }
    private static double average(double []a)
    {
        double total = 0;

        for(int i = 0; i < a.length; i++)
        {
            total += a[i];
        }

        return total/a.length;
    }
    private static String aboveAverage(double []a)
    {
        String aboveAverage = "";
        double average = average(a);

        for(int i = 0; i < a.length; i++)
        {
            if(a[i]>average)
                aboveAverage += String.format("%.1f",a[i]) + " ";
        }
        return aboveAverage;
    }
}
