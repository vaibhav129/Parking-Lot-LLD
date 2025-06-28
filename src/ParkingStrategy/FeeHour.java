package ParkingStrategy;

import vechicle.Vechicle;

import java.time.Duration;

public class FeeHour implements CalculateFee{
    @Override
    public int calcutefee() {
        return 120;
    }

    @Override
    public String returntype() {
        return "Hour";
    }
}
