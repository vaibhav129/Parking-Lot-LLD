package ParkingLot;

import parkingSlot.ParkingSlot;
import vechicle.Vechicle;

import java.util.*;

public class ParkingLot {
    private List<ParkingSlot> parkingSlots = new ArrayList<>();
    
    /**
     * Add a parking slot to the parking lot
     * @param parkingSlot the parking slot to add
     */
    public void addSlot(ParkingSlot parkingSlot) {
        parkingSlots.add(parkingSlot);
    }
    
    /**
     * Remove a parking slot from the parking lot
     * @param parkingSlot the parking slot to remove
     */
    public void remove(ParkingSlot parkingSlot) {
        parkingSlots.remove(parkingSlot);
    }
    
    /**
     * Find an available parking slot for the given vehicle
     * @param vehicle the vehicle to find a slot for
     * @return available parking slot or null if none found
     */
    public ParkingSlot findSlot(Vechicle vehicle) {
        for (ParkingSlot parkingSlot : parkingSlots) {
            if (parkingSlot.slotVechicleType(vehicle) && !parkingSlot.isEmptyCheck(vehicle)) {
                return parkingSlot;
            }
        }
        return null;
    }
    
    /**
     * Remove vehicle from the specified parking slot
     * @param parkingSlot the parking slot to remove vehicle from
     */
    public void removeVechicle(ParkingSlot parkingSlot) {
        parkingSlot.remove();
    }
}
