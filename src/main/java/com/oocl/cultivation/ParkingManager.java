package com.oocl.cultivation;

import java.util.List;

public class ParkingManager extends ParkingBoy {
    List<ParkingBoy> parkingBoys;

    public ParkingManager(ParkingLotList parkingLotList){
        super(parkingLotList);
    }

    public void addParkingBoy(ParkingBoy parkingBoy){
        parkingBoys.add(parkingBoy);
    }

    public ParkingTicket orderParkCar(ParkingBoy parkingBoy, Car car){
        if(parkingBoys.contains(parkingBoy)){
            ParkingTicket parkingTicket = parkingBoy.park(car);;
            String LastErrorMessage = parkingBoy.getLastErrorMessage();
            System.out.println(LastErrorMessage);
            return parkingTicket;
        }
        else {
            return null;
        }
    }

    public Car orderFetch(ParkingBoy parkingBoy, ParkingTicket parkingTicket){
        if(parkingBoys.contains(parkingBoy)){
            Car car = parkingBoy.fetch(parkingTicket);
            String LastErrorMessage = parkingBoy.getLastErrorMessage();
            System.out.println(LastErrorMessage);
            return car;
        }
        else {
            return null;
        }
    }
}
