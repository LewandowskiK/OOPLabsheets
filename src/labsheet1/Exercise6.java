package labsheet1;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double heights[] = new double[6];
        int i;
        double height;

        for(i=0; i<heights.length; i++)
        {
            System.out.print("Loop "+ (i+1) + "\t\tPlease enter height: ");
            height = input.nextDouble();
            height = heightValidation(height, i);
            heights[i]=height;
        }

        calculateStatistics(heights);
    }

    private static double heightValidation(double a, int b){
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        while(!valid){
            if(a<.5464 || a>2.72)
            {
                System.out.print("Loop "+(b+1)+"\t\tInvalid! Please re-enter height: ");
                a = input.nextDouble();
            }
            else
            {
                valid = true;
            }
        }
        return a;
    }
    private static void calculateStatistics(double a[])
    {
        System.out.println("====================\n\t\tHeight Statistics\n" +
                "====================\n\n\n");

        System.out.println("The average of the heights is " + String.format(
                "%.1fm",calculateAvgHeight(a)));
        System.out.println("The smallest height is " + getSmallestHeight(a) +"m");
        System.out.println("The number of values between 1.3m and 1.7m inclusive is " +
                getValuesBetween(a));
        System.out.println("The percentage of height values exceeding the global "+
                "average height is %"+ String.format("%.2f",aboveGlobalAvg(a)));
    }

    private static double calculateAvgHeight(double a[])
    {
        double avgHeight, total = 0;

        for(int j = 0; j<a.length; j++) {
            total+=a[j];
        }
        avgHeight = total/a.length;

        return avgHeight;
    }
    private static double getSmallestHeight(double a[])
    {
        double smallest = 100;

        for( int j=0; j<a.length; j++)
        {
            if(a[j]<smallest)
                smallest = a[j];
        }

        return smallest;
    }
    private static int getValuesBetween(double a[])
    {
        int validHeights = 0;

        for(int j=0; j<a.length; j++)
        {
            if(a[j]>=1.3&&a[j]<1.7)
                validHeights++;
        }

        return validHeights;
    }
    private static double aboveGlobalAvg(double a[]){
        int aboveAvg = 0;
        final double GLOBAL_AVERAGE_HEIGHT = 1.665;
        for(int j=0;j<a.length; j++)
        {
            if(a[j]>GLOBAL_AVERAGE_HEIGHT)
                aboveAvg++;
        }
        return(((float)aboveAvg/(float)a.length)*100);
    }
}
