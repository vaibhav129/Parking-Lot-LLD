package parkingSlot;

import vechicle.Bike;
import vechicle.Car;
import vechicle.Vechicle;

public class FourWheeler extends ParkingSlot {
    public FourWheeler(int slotId) {
        super(slotId);
    }
    
    @Override
    public boolean slotVechicleType(Vechicle vehicle) {
        return vehicle instanceof Car;
    }
}
