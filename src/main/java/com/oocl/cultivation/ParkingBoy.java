package com.oocl.cultivation;

import java.util.Comparator;
import java.util.Optional;

public class ParkingBoy {

    private String lastErrorMessage;
    public ParkingLotList parkingLotList;


    public ParkingBoy(ParkingLotList parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
        Optional<ParkingLot> chooseparkingLot = selectParkingLot();
        if (chooseparkingLot.isPresent()){
            ParkingLot parkingLot = chooseparkingLot.get();
            ParkingTicket parkingTicket = new ParkingTicket(parkingLot);
            parkingLot.park(parkingTicket,car);
            lastErrorMessage = null;
            return parkingTicket;
        }
        else {
            lastErrorMessage = "The parking lot is full.";
            return null;
        }
        //throw new RuntimeException("Not implemented");
    }

    public Car fetch(ParkingTicket parkingTicket) {
        // TODO: Please implement the method
        Car car = null;
        if(parkingTicket == null){
            lastErrorMessage = "Please provide your parking ticket.";
            return null;
        }
        if(parkingTicket.isUsed()){
            lastErrorMessage = "Unrecognized parking ticket.";
        }
        else {
            car = parkingTicket.getParkingLot().fetch(parkingTicket);
            parkingTicket.changeStates(true);
            lastErrorMessage = null;
        }
        if (car == null){
            lastErrorMessage = "Unrecognized parking ticket.";
        }
        return car;
        //throw new RuntimeException("Not implemented");
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }


    public Optional<ParkingLot> selectParkingLot() {
        return parkingLotList.getParkingLots().stream()
                .filter(ParkingLot::hasSpace)
                .findFirst();
    }
}
