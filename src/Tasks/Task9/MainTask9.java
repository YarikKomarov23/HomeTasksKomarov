package Tasks.Task9;

class MainTask9 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(2, 2); //the first instance
        System.out.println(obj.getArea());

        Rectangle obj2 = new Rectangle(3, 2); //the other instance
        System.out.println(obj2.getArea());
    }
}
