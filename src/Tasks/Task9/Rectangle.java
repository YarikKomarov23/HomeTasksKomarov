package Tasks.Task9;

public class Rectangle {

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        double area = length * width;
        return area;
    }
}
