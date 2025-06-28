package Gates;

import ParkingLot.ParkingManager;
import ticket.Ticket;
import vechicle.Vechicle;

public class Entry {
    ParkingManager p;
    public Entry(ParkingManager p)
    {
        this.p=p;
    }
    public Ticket allowentry(Vechicle v)
    {
        Ticket t=p.CreateTicket(v);
        if(t!=null)
        {
            System.out.println("ticket create");
            t.getdetails();
        }
        else {
            System.out.println("ticket cant create");
        }
        return t;
    }
}
