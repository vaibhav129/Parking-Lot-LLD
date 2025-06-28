package ParkingLot;

import parkingSlot.ParkingSlot;
import vechicle.Vechicle;

import java.util.*;
public class ParkingLot {
    List<ParkingSlot>ps=new ArrayList();
    public void addSlot(ParkingSlot p)
    {
        ps.add(p);
    }
    public void remove(ParkingSlot p)
    {
        ps.remove(p);
    }
    public ParkingSlot findSlot(Vechicle v)
    {
        for(ParkingSlot p:ps)
        {
            if(p.slotVechicleType(v) && !p.isEmptyCheck(v))
            {
                return p;
            }
        }
        return null;
    }
    public void removeVechicle(ParkingSlot p)
    {
        p.remove();
    }
}
