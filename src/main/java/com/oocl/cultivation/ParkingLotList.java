package com.oocl.cultivation;
import java.util.*;
public class ParkingLotList {
    List<ParkingLot> parkingLots;

    public ParkingLotList(List<ParkingLot> parkingLots){
        this.parkingLots = parkingLots;
    }

    public List<ParkingLot> getParkingLots(){
        return parkingLots;
    }
}
