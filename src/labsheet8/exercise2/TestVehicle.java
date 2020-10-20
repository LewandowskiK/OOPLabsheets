package labsheet8.exercise2;

public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("Testing the Car no-arg constructor\n");

        Car car1 = new Car();
        System.out.println(car1.toString() + "\n\nTesting the Car multi-arg constructor\n");

        Car car2 = new Car(100000,4.5,1.25,2000.0,
                "Ferrari","F2",2,"05-KY-1");
        System.out.println(car2.toString()+ "\n\nTesting the Bike no-arg constructor\n") ;

        Bike bike1 = new Bike();
        System.out.println(bike1.toString() + "\n\nTesting the bike multi-arg constructor\n");

        Bike bike2 = new Bike(500,1.5,1.0,50.0,
                "Raleigh","Mountainbike",4,true);
        System.out.println(bike2.toString());
    }
}
