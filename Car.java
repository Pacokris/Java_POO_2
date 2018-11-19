public class Car extends Vehicle {

    private String bruit = "vroom vroom";

    public Car(String brand, int kilometers){
        super(brand, kilometers);
    }
    public void doStuff() {
        System.out.println("Je suis " + brand + " et je fais " + bruit + " !");
    }
}