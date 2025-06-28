package parkingSlot;

import vechicle.Vechicle;

public abstract class ParkingSlot {
    int slotId;
    boolean isOccupied;
    Vechicle parkedVehicle;
    
    public ParkingSlot(int slotId) {
        this.slotId = slotId;
        this.isOccupied = false;
        this.parkedVehicle = null;
    }
    
    public boolean isEmptyCheck(Vechicle vehicle) {
        return isOccupied;
    }

    public int getSlotId() {
        return slotId;
    }

    public Vechicle getVechicle() {
        return parkedVehicle;
    }
    
    public void ParkVechicle(Vechicle vehicle) {
        if (slotVechicleType(vehicle)) {
            this.parkedVehicle = vehicle;
            this.isOccupied = true;
        }
    }
    
    public Vechicle remove() {
        Vechicle vehicle = this.parkedVehicle;
        this.parkedVehicle = null;
        this.isOccupied = false;
        return vehicle;
    }
    
    public abstract boolean slotVechicleType(Vechicle vehicle);
}
