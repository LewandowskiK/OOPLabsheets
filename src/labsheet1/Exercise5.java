package labsheet1;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        final double g = 9.81;
        Scanner input = new Scanner(System.in);
        double massEarth, radiusEarth, massPlanet, radiusPlanet;
        String massEarthAS, radiusEarthAS, massPlanetAS, radiusPlanetAS;

        System.out.print("Please enter the mass of planet Earth: ");
        massEarthAS = input.nextLine();
        massEarth = Double.parseDouble(massEarthAS);

        System.out.print("Please enter the radius of planet Earth: ");
        radiusEarthAS = input.nextLine();
        radiusEarth = Double.parseDouble(radiusEarthAS);

        System.out.print("Please enter the mass of the other planet: ");
        massPlanetAS = input.nextLine();
        massPlanet = Double.parseDouble(massPlanetAS);

        System.out.print("Please enter the radius of the other planet: ");
        radiusPlanetAS = input.nextLine();
        radiusPlanet = Double.parseDouble(radiusPlanetAS);

        System.out.println("\n\nThe accelaration due to gravity on the other planet is " +
                String.format("%.2f",((g*massPlanet*radiusEarth*radiusEarth)/(massEarth*radiusPlanet*radiusPlanet))) +
                "m/s/s");

        System.exit(0);
    }
}
