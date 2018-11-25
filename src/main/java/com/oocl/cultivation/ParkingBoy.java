package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;


    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
        if (parkingLot.hasSpace()){
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
            car = parkingLot.fetch(parkingTicket);
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
}
