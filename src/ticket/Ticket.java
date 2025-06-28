package ticket;

import parkingSlot.ParkingSlot;

public class Ticket {

    int ticketId;
    String type;
    String time;
    private ParkingSlot slot;
    public Ticket(int ticketId,String type,String time,ParkingSlot slot)
    {
        this.ticketId=ticketId;
        this.slot=slot;
        this.type=type;
        this.time=time;
    }
    public void getdetails()
    {
        System.out.println(ticketId+"id"+type+"vechicle type"+time+"Time");
    }
    public int getTicketId() {
        return ticketId;
    }
    public ParkingSlot getSlot() {
        return slot;
    }
}
