package labsheet9.exercise2;

public class Ellipse extends Shape{
    private double minorAxis;
    private double majorAxis;

    public Ellipse(){
        super("Ellipse");
        this.minorAxis = 0;
        this.majorAxis = 0;
    }

    public Ellipse(double minorAxis, double majorAxis) {
        super("Ellipse");
        this.minorAxis = minorAxis;
        this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }
    public void setMinorAxis(double minorAxis) {
        if(minorAxis>0)
            this.minorAxis = minorAxis;
        else
            this.minorAxis = 0;
    }
    public double getMajorAxis() {
        return majorAxis;
    }
    public void setMajorAxis(double majorAxis) {
        if(majorAxis>0)
            this.majorAxis = majorAxis;
        else
            this.majorAxis = 0;
    }

    public double area() {
        return Math.PI*getMajorAxis()*getMinorAxis();
    }
    public double perimeter() {
        return (2*Math.PI)*(Math.sqrt(((getMajorAxis()*getMajorAxis())+
                (getMinorAxis()*getMinorAxis()))/2f));
    }
    public String toString(){
        return "Type: " + type + "\nArea: " + area() +
                "\nPerimeter: " + perimeter();
    }
}
