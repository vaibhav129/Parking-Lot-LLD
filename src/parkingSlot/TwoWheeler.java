package parkingSlot;

import vechicle.Bike;
import vechicle.Vechicle;

public class TwoWheeler extends ParkingSlot {
    public TwoWheeler(int slotId) {
        super(slotId);
    }
    
    @Override
    public boolean slotVechicleType(Vechicle vehicle) {
        return vehicle instanceof Bike;
    }
}
