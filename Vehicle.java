public abstract class Vehicle {
    // Attributs
    protected String brand;
    protected int kilometers;

    // Constructeur
    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    // accesseurs (getters)
    public String getBrand() {
        return this.brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    // mutateurs (setters)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // méthode instanciée
    public void doStuff() {
        System.out.println("Je suis " + getBrand() + " et je fais " + get.Bruit() + "!");
    }
}