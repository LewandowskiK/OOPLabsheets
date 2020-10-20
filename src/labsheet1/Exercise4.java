package labsheet1;

import javax.swing.*;

public class Exercise4 {
    public static void main(String[] args){
        String distanceTravelled, name;

        name = JOptionPane.showInputDialog("Please enter your name");

        distanceTravelled = JOptionPane.showInputDialog("Please enter the distance travelled");

        JOptionPane.showMessageDialog(null,
                "Name: "+name +"\nDistance cycled: " + distanceTravelled +
                        "\nSponsorship due: €" + String.format("%.2f",calcSponsorDue(distanceTravelled)),
                "Receipt",
                JOptionPane.INFORMATION_MESSAGE);
    }
    private static double calcSponsorDue(String a){
        double amount;
        int distance;
        final double lowerRate = 1.75;
        final double higherRate = 2.5;
        final int lowerCutoff = 10;

        distance = Integer.parseInt(a);

        if(distance > 10)
        {
            amount = (lowerCutoff*lowerRate + (distance-lowerCutoff)*higherRate);
        }
        else
        {
            amount = distance * lowerRate;
        }

        return amount;
    }
}
