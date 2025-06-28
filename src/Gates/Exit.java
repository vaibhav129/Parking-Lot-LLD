package Gates;

import ParkingLot.ParkingManager;
import payment.Payment;
import ticket.Ticket;
import vechicle.Vechicle;
import ParkingStrategy.CalculateFee;

public class Exit {
    ParkingManager p;
    CalculateFee ps;
   public Exit(ParkingManager p,CalculateFee c)
   {
       this.p=p;
       this.ps=c;
   }
   public boolean exitallow(Ticket t, Payment pa)
    {
        System.out.println("Processing exit");
        if(!p.getActiveTickets().containsKey(t.getTicketId())){
            System.out.println("Ticket does not exist");
        }
        int fee=ps.calcutefee();
        System.out.println("Pricing Strategy: " + ps.returntype());
         if(pa.ProcessPayment()){
             p.getActiveTickets().remove(t.getTicketId());
             p.getParkingLot().removeVechicle(t.getSlot());
             System.out.println("Exiting the vechicle");
         }
         else {
             System.out.println("Payment failed. Vehicle cannot exit.");
         }

        return false;
    }
}
