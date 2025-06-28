package parkingSlot;

import vechicle.Vechicle;

public abstract class ParkingSlot {
    int SlotId;
    boolean isOccupied;
    Vechicle ps;
    public ParkingSlot(int slot)
    {
        this.SlotId=slot;
        this.isOccupied=false;
        this.ps=null;
    }
    public boolean isEmptyCheck(Vechicle v)
    {
        return isOccupied;
    }

    public int getSlotId() {
        return SlotId;
    }

    public Vechicle getVechicle() {
        return ps;
    }
    public void ParkVechicle(Vechicle v)
    {
        if(slotVechicleType(v))
        {
            this.ps=v;
            this.isOccupied=true;
        }
    }
    public Vechicle remove()
    {
        Vechicle v=this.ps;
        this.ps=null;
        this.isOccupied=false;
        return v;
    }
    public abstract boolean slotVechicleType(Vechicle v);
}
