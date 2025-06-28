package vechicle;

public class Car extends Vechicle{

    public Car(String Plate)
    {
        super(Plate);

    }
    @Override
    public String TypeVechicle() {
        return "Four Wheeler";
    }
}
