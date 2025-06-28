package vechicle;

public class Bike extends Vechicle {
    public Bike(String plateNumber) {
        super(plateNumber);
    }
    
    @Override
    public String TypeVechicle() {
        return "Two Wheeler";
    }
}
