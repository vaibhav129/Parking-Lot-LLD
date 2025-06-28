package ParkingLot;

import parkingSlot.ParkingSlot;
import ticket.Ticket;
import vechicle.Vechicle;

import java.util.HashMap;
import java.util.Map;

public class ParkingManager {
    ParkingLot s;
    Map<Integer, Ticket>active;
    int slotcounter;
    public ParkingManager(ParkingLot p)
    {
        this.s=p;
        this.active=new HashMap<>();
        this.slotcounter=1;
    }
    public Ticket CreateTicket(Vechicle v)
    {
        ParkingSlot slot= s.findSlot(v);
        if(slot==null)
        {
            System.out.println("nahi hai parking");
        }
        slot.ParkVechicle(v);
        int ticketid=slotcounter;
        slotcounter++;
        Ticket obj= new Ticket(ticketid,v.TypeVechicle(),"time", slot);
        active.put(ticketid,obj);
        System.out.println("Ticket created: " + ticketid + " for ");
        return obj;
    }
    public Map<Integer, Ticket> getActiveTickets() {
        return new HashMap<>(active);
    }
    public ParkingLot getParkingLot() {
        return s;
    }
}
