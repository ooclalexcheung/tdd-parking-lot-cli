package com.oocl.cultivation;

public class ParkingTicket {
    ParkingLot parkingLot;
    boolean used;

    public ParkingTicket(ParkingLot parkingLot){
        this.parkingLot =parkingLot;
        used=false;
    }

    public boolean isUsed(){
        return used;
    }

    public void changeStates(boolean used){
        this.used = used;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }
}