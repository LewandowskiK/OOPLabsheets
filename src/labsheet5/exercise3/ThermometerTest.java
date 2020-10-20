package labsheet5.exercise3;

import javax.swing.*;

public class ThermometerTest {
    public static void main(String[] args) {
        String output = "*****Thermometer Testing*****";
        Thermometer t1 = new Thermometer(35);

        output += "\n\nCalling the single-argument constructor....setting the temperature" +
                " of the first thermometer to 35C\nFirst Thermometer:\n" + t1.toString();

        Thermometer t2 = new Thermometer();

        output += "\n\nCalling the no-argument constructor...setting the temperature of the " +
                "second thermometer to 0C\nSecond Thermometer:\n" + t2.toString();

        t2.setCurrentTemp(25);
        output += "\n\nCalling setTemperature()....setting the temperature of the second" +
                " thermometer to 25C\nSecond Thermometer:\n" + t2.toString();

        JOptionPane.showMessageDialog(null,output,"",
                JOptionPane.INFORMATION_MESSAGE);

        int temp =Integer.parseInt(JOptionPane.showInputDialog("Please enter" +
                " the temperature of the first thermometer",48));
        t1.setCurrentTemp(temp);
        output = "*****Thermometer Testing*****\nCalling setTemperature().....setting the " +
                "temperature of the first thermometer to " + temp + "C" +
                "\nFirst Thermometer:\n" + t1.toString();

        JOptionPane.showMessageDialog(null,output,"",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
