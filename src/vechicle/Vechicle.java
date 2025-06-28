package vechicle;

public abstract class Vechicle {
    String PlateNumber;

    public Vechicle(String Pn)
    {
        this.PlateNumber=Pn;
    }
    public abstract String TypeVechicle();

}
