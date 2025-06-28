package parkingSlot;

import vechicle.Bike;
import vechicle.Vechicle;

public class TwoWheeler extends ParkingSlot{
    public TwoWheeler(int slot)
    {
        super(slot);
    }
    @Override
    public boolean slotVechicleType(Vechicle v) {
        return v instanceof Bike;
    }
}
