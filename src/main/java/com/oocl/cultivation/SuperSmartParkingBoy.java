package com.oocl.cultivation;

import java.util.Comparator;
import java.util.Optional;

public class SuperSmartParkingBoy extends ParkingBoy{
    public SuperSmartParkingBoy(ParkingLotList parkingLotList){
        super(parkingLotList);
    }

    @Override
    public Optional<ParkingLot> selectParkingLot() {
        return parkingLotList.getParkingLots().stream()
                .filter(ParkingLot::hasSpace)
                .max(Comparator.comparing(ParkingLot::getAvailablePositionRate));
    }
}
