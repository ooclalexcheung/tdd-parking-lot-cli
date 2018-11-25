package com.oocl.cultivation;

import java.util.Comparator;
import java.util.Optional;

public class SmartParkingBoy extends ParkingBoy {

    public SmartParkingBoy(ParkingLotList parkingLotList){
        super(parkingLotList);
    }

    @Override
    public Optional<ParkingLot> selectParkingLot() {
        return parkingLotList.getParkingLots().stream()
                .filter(ParkingLot::hasSpace)
                .max(Comparator.comparing(ParkingLot::getAvailableParkingPosition));
    }
}
