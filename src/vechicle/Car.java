package vechicle;

public class Car extends Vechicle {

    public Car(String plateNumber) {
        super(plateNumber);
    }
    
    @Override
    public String TypeVechicle() {
        return "Four Wheeler";
    }
}
