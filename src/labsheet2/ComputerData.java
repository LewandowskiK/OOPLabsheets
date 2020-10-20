//ComputerData.java
//Exercise1
/*This program will ask the user to input a serial number for a computer, along with its storage space
* , processor and price. It will then display average storage, the range of the prices and
* cheapest processor*/

package labsheet2;

import javax.swing.*;

public class ComputerData {
    public static void main(String[] args) {
        String serialNumber, diskSpaceAS, priceAS, processorType ,cheapestProcessorType ="";
        double lowestPrice = 5000, highestPrice = 0, price;
        int []diskSpace = new int[1];
        int counter = 0;

        do{
            serialNumber = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit)");
            if(serialNumber.equals(""))
            {
                break;
            }

            diskSpaceAS = JOptionPane.showInputDialog("Please enter the hard-disk space");
            while(!validateDiskSpace(diskSpaceAS))
            {
                diskSpaceAS = JOptionPane.showInputDialog("Invalid! Please re-enter hard-disk space");
            }
            diskSpace[counter] = Integer.parseInt(diskSpaceAS);

            processorType = JOptionPane.showInputDialog("Please enter the processor type");
            priceAS = JOptionPane.showInputDialog("Please enter the price");
            price = Double.parseDouble(priceAS);
            if(price < lowestPrice)
            {
                lowestPrice = price;
                cheapestProcessorType = processorType;
            }
            if(price > highestPrice)
                highestPrice = price;

        }while(!serialNumber.equals(""));

        JOptionPane.showMessageDialog(null,
                "The average disk space available on the computers processed is " + averageDiskSpace(diskSpace) +
                " GB\nThe price range of the computers is €" + lowestPrice + " to €" + highestPrice +
                "\nThe processor type for the cheapest computer is " + cheapestProcessorType,
                "Computer Stats",
                JOptionPane.INFORMATION_MESSAGE);
    }
    private static boolean validateDiskSpace(String a){
        boolean valid = false;
        int i,diskSpace;

        if(a.length() <= 4)
        {
         for(i = 0; i < a.length(); i++)
         {
             if(!Character.isDigit(a.charAt(i)))
                 break;
         }
         if(i == a.length())
         {
             diskSpace = Integer.parseInt(a);
             if(diskSpace < 5000 && diskSpace > 50)
                 valid = true;
         }
        }
        return valid;
    }
    private static int averageDiskSpace(int []a)
    {
        int totalDiskSpace = 0;

        for(int i = 0; i < a.length; i++)
        {
            totalDiskSpace += a[i];
        }

        return totalDiskSpace/a.length;
    }
}
