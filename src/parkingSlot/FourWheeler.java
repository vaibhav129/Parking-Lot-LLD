package parkingSlot;

import vechicle.Bike;
import vechicle.Car;
import vechicle.Vechicle;

public class FourWheeler extends ParkingSlot{
    public FourWheeler(int slot)
    {
        super(slot);
    }
    @Override
    public boolean slotVechicleType(Vechicle v) {
        return v instanceof Car;
    }
}
