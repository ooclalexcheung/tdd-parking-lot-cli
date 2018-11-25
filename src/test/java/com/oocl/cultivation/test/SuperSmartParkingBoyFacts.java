package com.oocl.cultivation.test;

import com.oocl.cultivation.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class SuperSmartParkingBoyFacts {

    @Test
    void should_select_second_parking_lot() {

        ParkingLot parkingLot1 = new ParkingLot(5);
        ParkingLot parkingLot2 = new ParkingLot(2);
        parkingLot1.park(new ParkingTicket(parkingLot1), new Car());

        ParkingLotList ParkingLotList = new ParkingLotList(Arrays.asList(parkingLot1, parkingLot2));
        ParkingBoy superSmartParkingBoy = new SuperSmartParkingBoy(ParkingLotList);

        ParkingLot selectedParkingLot = superSmartParkingBoy.selectParkingLot().get();

        assertSame(selectedParkingLot, parkingLot2);
    }
    //Given lotlist with different space left, different capacity, super smart boy, car, when park, then should park the car into a place with higher rate



}
