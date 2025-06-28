package ticket;

import parkingSlot.ParkingSlot;

public class Ticket {

    int ticketId;
    String vehicleType;
    String entryTime;
    private ParkingSlot parkingSlot;
    
    public Ticket(int ticketId, String vehicleType, String entryTime, ParkingSlot parkingSlot) {
        this.ticketId = ticketId;
        this.parkingSlot = parkingSlot;
        this.vehicleType = vehicleType;
        this.entryTime = entryTime;
    }
    
    public void getdetails() {
        System.out.println(ticketId + " id " + vehicleType + " vehicle type " + entryTime + " Time");
    }
    
    public int getTicketId() {
        return ticketId;
    }
    
    public ParkingSlot getSlot() {
        return parkingSlot;
    }
}
