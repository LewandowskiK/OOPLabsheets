package labsheet9.exercise2;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        super("Triangle");
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }

    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        if(side1>0)
            this.side1 = side1;
        else
            this.side1 = 0;
    }

    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        if(side2>0)
            this.side2 = side2;
        else
            this.side2 = 0;
    }

    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        if(side3>0)
            this.side3 = side3;
        else
            this.side3 = 0;
    }

    public double area(){
        double s = (getSide1()+getSide2()+getSide3())/2f;

        return Math.sqrt(s*(s-getSide1())*(s-getSide2())*(s-getSide3()));
    }
    public double perimeter(){
        return getSide1()+getSide2()+getSide3();
    }

    @Override
    public String toString() {
        return "Type: " + type + "\nArea: " + area() + "\nPerimeter: " +
                perimeter();
    }
}
