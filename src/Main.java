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
        
        // Initialize parking lot with slots
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addSlot(new TwoWheeler(1));
        parkingLot.addSlot(new FourWheeler(2));

        // Initialize parking manager and entry gate
        ParkingManager parkingManager = new ParkingManager(parkingLot);
        Entry entryGate = new Entry(parkingManager);
        
        System.out.println("--- VEHICLE ENTRY ---");
        
        // Create vehicles
        Bike bike = new Bike("BIKE001");
        Car car = new Car("CAR001");
        
        // Allow vehicle entry and create tickets
        Ticket bikeTicket = entryGate.allowentry(bike);
        Ticket carTicket = entryGate.allowentry(car);
        
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        
        System.out.println("\n--- EXIT WITH HOURLY PRICING ---");
        
        // Set up exit gate with hourly pricing strategy
        CalculateFee hourlyPricingStrategy = new FeeHour();
        Exit exitGate = new Exit(parkingManager, hourlyPricingStrategy);
        Cash cashPayment = new Cash();
        
        // Process vehicle exit
        exitGate.exitallow(bikeTicket, cashPayment);
    }
}