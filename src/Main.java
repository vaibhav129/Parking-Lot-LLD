import Gates.Entry;
import Gates.Exit;
import ParkingLot.*;
import ParkingStrategy.CalculateFee;
import ParkingStrategy.FeeHour;
import parkingSlot.FourWheeler;
import parkingSlot.TwoWheeler;
import payment.Cash;
import ticket.Ticket;
import vechicle.Bike;
import vechicle.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== PARKING LOT SYSTEM DEMO (Strategy Pattern) ===\n");
        ParkingLot lot=new ParkingLot();
        lot.addSlot(new TwoWheeler(1));
        lot.addSlot(new FourWheeler(2));

        ParkingManager p=new ParkingManager(lot);
        Entry e=new Entry(p);
        System.out.println("--- VEHICLE ENTRY ---");
         Bike tw=new Bike("Tw01");
         Car fw=new Car("fw01");
        Ticket t1=e.allowentry(tw);
        Ticket t2=e.allowentry(fw);
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException j) {
            j.printStackTrace();
        }
        System.out.println("\n--- EXIT WITH HOURLY PRICING ---");
        CalculateFee hourlyPricing = new FeeHour();
        Exit exitGate1 = new Exit(p, hourlyPricing);
        Cash cashPayment = new Cash();
        exitGate1.exitallow(t1, cashPayment);
    }
}