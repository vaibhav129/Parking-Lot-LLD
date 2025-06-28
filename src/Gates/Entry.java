package Gates;

import ParkingLot.ParkingManager;
import ticket.Ticket;
import vechicle.Vechicle;

public class Entry {
    ParkingManager parkingManager;
    
    public Entry(ParkingManager parkingManager) {
        this.parkingManager = parkingManager;
    }
    
    public Ticket allowentry(Vechicle vehicle) {
        Ticket ticket = parkingManager.CreateTicket(vehicle);
        if (ticket != null) {
            System.out.println("ticket create");
            ticket.getdetails();
        } else {
            System.out.println("ticket cant create");
        }
        return ticket;
    }
}
