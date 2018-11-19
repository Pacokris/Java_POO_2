public class Boat extends Vehicle {
    
    private String bruit = "glou glou";

    public Boat(String brand, int kilometers){
        super(brand, kilometers);
    }
    public void doStuff() {
        System.out.println("Je suis " + brand + " et je fais " + bruit + " !");
    }
}