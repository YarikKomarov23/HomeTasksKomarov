package Tasks.Task10;

public class Car extends Vehicle{

    private String carName = "Roadster";

    public String getCarName() {
        return carName;
    }

    public void getDetails(String carName){
        getModel();
        getSpeed();
    }

    public void print(String str){
        System.out.println(str);
    }
}
