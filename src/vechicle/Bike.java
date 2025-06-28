package vechicle;

public class Bike extends Vechicle{
    public Bike(String Plate)
    {
        super(Plate);

    }
    @Override
    public String TypeVechicle() {
        return "Two Wheeler";
    }
}
