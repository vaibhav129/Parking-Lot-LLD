package vechicle;

public abstract class Vechicle {
    String plateNumber;

    public Vechicle(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    
    public abstract String TypeVechicle();
}
