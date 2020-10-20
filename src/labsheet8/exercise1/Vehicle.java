package labsheet8.exercise1;

public class Vehicle {
    private double price;
    private double length;
    private double height;
    private double weight;
    private String manufacturer;
    private String model;

    public Vehicle(){
        this(0.0,0.0,0.0,0.0,
                "No Manufacturer Supplied","No Model Supplied");
    }

    public Vehicle(double price, double length, double height, double weight,
                   String manufacturer, String model) {
        setPrice(price);
        setLength(length);
        setHeight(height);
        setWeight(weight);
        setManufacturer(manufacturer);
        setModel(model);
    }

    //Getters
    public double getPrice() {
        return price;
    }
    public double getLength() {
        return length;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }

    //Setters
    public void setPrice(double price) {
        this.price = price;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return  "\nPrice=" + getPrice() +
                "\nLength=" + getLength() +
                "\nHeight=" + getHeight() +
                "\nWeight=" + getWeight() +
                "\nManufacturer='" + getManufacturer() +
                "\nModel='" + getModel();
    }
}
