package Gates;

import ParkingLot.ParkingManager;
import payment.Payment;
import ticket.Ticket;
import vechicle.Vechicle;
import ParkingStrategy.CalculateFee;

public class Exit {
    ParkingManager parkingManager;
    CalculateFee pricingStrategy;
    
    public Exit(ParkingManager parkingManager, CalculateFee pricingStrategy) {
        this.parkingManager = parkingManager;
        this.pricingStrategy = pricingStrategy;
    }
    
    public boolean exitallow(Ticket ticket, Payment payment) {
        System.out.println("Processing exit");
        if (!parkingManager.getActiveTickets().containsKey(ticket.getTicketId())) {
            System.out.println("Ticket does not exist");
        }
        int fee = pricingStrategy.calcutefee();
        System.out.println("Pricing Strategy: " + pricingStrategy.returntype());
        if (payment.ProcessPayment()) {
            parkingManager.getActiveTickets().remove(ticket.getTicketId());
            parkingManager.getParkingLot().removeVechicle(ticket.getSlot());
            System.out.println("Exiting the vehicle");
        } else {
            System.out.println("Payment failed. Vehicle cannot exit.");
        }

        return false;
    }
}
