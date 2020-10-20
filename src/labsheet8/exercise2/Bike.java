package labsheet8.exercise2;

public class Bike extends Vehicle {
    private int gearCount;
    private boolean hasBell;

    public Bike(){
        setGearCount(0);
        setHasBell(false);
    }

    public Bike(double price, double length, double height, double weight,
                String manufacturer, String model, int gearCount, boolean hasBell) {
        super(price, length, height, weight, manufacturer, model);
        setGearCount(gearCount);
        setHasBell(hasBell);
    }

    //Getters and Setters
    public int getGearCount() {
        return gearCount;
    }
    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean getGasBell() {
        return hasBell;
    }
    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    @Override
    public String toString(){
        String output = super.toString() + "\nNumber of Gears: " + getGearCount() +
                "\nHas bell: ";
        if(getGasBell())
            output += "Yes";
        else
            output += "No";

        return output;
    }
}
