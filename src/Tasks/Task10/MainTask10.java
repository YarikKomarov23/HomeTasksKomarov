package Tasks.Task10;

public class MainTask10 {
    public static void main(String[] args) {
        Car myTesla = new Car();

        //print line according to requirement
        myTesla.print("\"" + myTesla.getCarName() + ", " + myTesla.getModel() + ", " + myTesla.getSpeed() + "\"");
    }
}
