//Exercise5
//RandomArray.java
/*This program will populate an int array of size 10 with random int's between
* 1 and 1000 inclusively, it will then display the initial values, then sort them into
* ascending order, display the percentage that exceed the value 100 and display the sorted
* array*/
package labsheet2;

import javax.swing.*;
import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        int randomNumbers[] = new int[10];
        randomNumbers = populateArray();
        String beforeSort = Arrays.toString(randomNumbers);
        Arrays.sort(randomNumbers);

        JOptionPane.showMessageDialog(null,
                "The initial contents of the array is " + beforeSort +
                "\nThe percentage of values that exceed 100 is " +
                        exceed100(randomNumbers) + "%" +
                "\nThe contents of the array after sorting is: " +
                        Arrays.toString(randomNumbers),
                "Array Stats",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    private static int[] populateArray()
    {
        int numbers[] = new int[10];

        for(int i = 0; i < numbers.length; i++)
        {                       //range=max-min+1(inclusive)
            numbers[i] = (int)(Math.random()*(1000-1+1)+1);
        }

        return numbers;
    }
    private static int exceed100(int a[])
    {
        int exceed100=0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i]>100)
                exceed100++;
        }
        return exceed100*10;
    }
}
