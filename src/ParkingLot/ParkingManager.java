package ParkingLot;

import parkingSlot.ParkingSlot;
import ticket.Ticket;
import vechicle.Vechicle;

import java.util.HashMap;
import java.util.Map;

public class ParkingManager {
    ParkingLot parkingLot;
    Map<Integer, Ticket> activeTickets;
    int ticketCounter;
    
    public ParkingManager(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
        this.activeTickets = new HashMap<>();
        this.ticketCounter = 1;
    }
    
    public Ticket CreateTicket(Vechicle vehicle) {
        ParkingSlot slot = parkingLot.findSlot(vehicle);
        if (slot == null) {
            System.out.println("nahi hai parking");
        }
        slot.ParkVechicle(vehicle);
        int ticketId = ticketCounter;
        ticketCounter++;
        Ticket ticket = new Ticket(ticketId, vehicle.TypeVechicle(), "time", slot);
        activeTickets.put(ticketId, ticket);
        System.out.println("Ticket created: " + ticketId + " for ");
        return ticket;
    }
    
    public Map<Integer, Ticket> getActiveTickets() {
        return new HashMap<>(activeTickets);
    }
    
    public ParkingLot getParkingLot() {
        return parkingLot;
    }
}
