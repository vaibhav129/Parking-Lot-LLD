package ParkingStrategy;

import vechicle.Vechicle;

import java.time.Duration;

public class FeebyDay implements CalculateFee{
    @Override
    public int calcutefee() {
        return 100;
    }

    @Override
    public String returntype() {
        return "Day";
    }
}
